package presenter;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import model.AttendanceService;
import model.Student;
import view.AttendanceView;

public class Presenter {
    private AttendanceView view;
    private AttendanceService model;

    public Presenter(AttendanceView view, AttendanceService model) {
        this.view = view;
        this.model = model;
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        while (true) {
        System.out.println("Выберите пункт в меню");
        System.out.println("1. Показать всех студентов");
        System.out.println("2. Показать студентов с низкой посещаемостью");
        System.out.println("3. Показать студентов в порядке убывания по посещению");
        System.out.println("4. Exit");

        switch (sc.nextInt()) {
            case 1:
                view.printMap(persentName());

                break;
            case 2:
                view.printMap(attendanceBelow(persentName()));

                break;
            case 3:
                view.printStr(attendanceSort(persentName()));

                break;
            case 4:
            sc.close();
                break;
        }
        }
        
    }

    public Map<String, Double> persentName() {
        Map<String, Double> nameAndPersent1 = new HashMap<>();
        for (Student student : model.getList()) {
            int count = 0;
            for (Map.Entry<LocalDate, Boolean> ifItWas : student.getAttendance().entrySet()) {
                if (ifItWas.getValue() == true)
                    count++;
            }

            nameAndPersent1.put(student.getName(), (double) count / student.getAttendance().size() * 100);
        }
        return nameAndPersent1;
    }

    public Map<String, Double> attendanceBelow(Map<String, Double> map) {

        Map<String, Double> bellow = new HashMap<>();
        for (Map.Entry<String, Double> percent : map.entrySet()) {
            if (percent.getValue() <= 0.25) {
                bellow.put(percent.getKey(), percent.getValue());
            }

        }
        return bellow;
    }

    public String[] attendanceSort(Map<String, Double> map) {

        String[] names = new String[model.getList().size()];

        Map<String, Double> nameAndPerscent2 = new HashMap<>();
        nameAndPerscent2.putAll(map);

        int count = 0;
        for (Map.Entry<String, Double> student : map.entrySet()) {
            String keyString = "";
            Double maxValue = 0.0;
            for (Map.Entry<String, Double> studentMax : nameAndPerscent2.entrySet()) {
                if (maxValue <= studentMax.getValue()) {
                    maxValue = studentMax.getValue();
                    keyString = studentMax.getKey();
                }
            }
            names[count] = keyString;
            count++;
            nameAndPerscent2.remove(keyString);
        }
        return names;

    }

}

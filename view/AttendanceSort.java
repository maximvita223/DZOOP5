package view;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Student;

public class AttendanceSort implements AttendanceView {

    @Override
    public void printList(List<Student> studentsTimesOff) {

        System.out.println("Отсортированный список студентов по убыванию");
        String[] names = new String[studentsTimesOff.size()];
        Map<String, Double> nameAndPersent1 = new HashMap<>();
        for (Student student : studentsTimesOff) {
            int count = 0;
            for (Map.Entry<LocalDate, Boolean> ifItWas : student.getAttendance().entrySet()) {
                if (ifItWas.getValue() == true)
                    count++;
            }

            nameAndPersent1.put(student.getName(), (double) count / student.getAttendance().size() * 100);

        }

        Map<String, Double> nameAndPerscent2 = new HashMap<>();
        nameAndPerscent2.putAll(nameAndPersent1);

        int count = 0;
        for(Map.Entry<String, Double> max : nameAndPersent1.entrySet()){
        String keyString = "";
        Double MaxValue = 0.0;
        for (Map.Entry<String, Double> max1 : nameAndPerscent2.entrySet()) {
            if (MaxValue <= max1.getValue()) {
                MaxValue = max1.getValue();
                keyString = max1.getKey();
            }
        }
        names[count] = keyString;
        count++;
        nameAndPerscent2.remove(keyString);
    }
        for (String name : names) {
            System.out.println("Студент =  " + name + " успеваемость = " + nameAndPersent1.get(name) + "%");

        }

        System.out.println();

    }

}

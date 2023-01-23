package view;

import java.util.Map;


public class AttendanceView {
    
    public AttendanceView() {
    }

    public void printMap(Map<String,Double> students){
        for (Map.Entry<String, Double> student : students.entrySet())
            System.out.println(student);   
        }
    
    public void printStr(String[] students){
        for (String student : students) {
            System.out.println(student);
        }
    }
}
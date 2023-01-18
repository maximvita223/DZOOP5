package view;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import model.Student;

public class AttendanceBelowView implements AttendanceView {

    @Override
    public void printList(List<Student> studentsTimesOff) {
        for (Student student : studentsTimesOff) {
            int count = 0;
            for (Map.Entry<LocalDate,Boolean> entry : student.getAttendance().entrySet()) {
                if(entry.getValue() == true)  count++;
            }
            if ((double)count/student.getAttendance().size()<=0.25) {
                System.out.println("Студент с посещаемостью ниже 25% " + student.getName() + "\n");
            }
            
        }
        
    }
   
}
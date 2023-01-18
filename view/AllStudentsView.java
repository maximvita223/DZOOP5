package view;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import model.Student;

public class AllStudentsView implements AttendanceView {

    @Override
    public void printList(List<Student> studentsTimesOff) {
        for (Student student : studentsTimesOff) {
            int count = 0;
            for (Map.Entry<LocalDate,Boolean> entry : student.getAttendance().entrySet()) {
                if(entry.getValue() == true)  count++;
            }
            System.out.println((double)count/student.getAttendance().size()*100 + "%\n");
        }
        
    }
   
}

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Map;

import model.AttendanceService;
import model.Student;
import presenter.Presenter;
import view.AllStudentsView;
import view.AttendanceBelowView;
import view.AttendanceSort;


    public class Main{
        public static void main(String[] args) {
            AttendanceService serv = new AttendanceService( Arrays.asList(
                new Student("Egor",Map.of(LocalDate.of(2023, 1, 1) , false, 
                LocalDate.of(2023, 1, 13) , false, 
                LocalDate.of(2023, 1, 15) , false, 
                LocalDate.of(2023, 1, 16) , false)) ,
                new Student("Roman",Map.of(LocalDate.of(2023, 1, 1) , false, 
                LocalDate.of(2023, 1, 5) , false, 
                LocalDate.of(2023, 1, 7) , true, 
                LocalDate.of(2023, 1, 8) , true)),
                new Student("Lia",Map.of(LocalDate.of(2023, 1, 1) , false, 
                LocalDate.of(2023, 1, 9) , true, 
                LocalDate.of(2023, 1, 10) , false, 
                LocalDate.of(2023, 1, 12) , true))
                )
            ); 
        AllStudentsView view1 = new AllStudentsView();

        AttendanceBelowView view2 = new AttendanceBelowView();

        AttendanceSort view3 = new AttendanceSort();
        Presenter presenter1 = new Presenter(view1, serv);
        presenter1.run();
        Presenter presenter2 = new Presenter(view2, serv);
        presenter2.run();
        Presenter presenter3 = new Presenter(view3, serv);
        presenter3.run();        
        }
    }
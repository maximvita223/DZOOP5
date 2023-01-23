import java.time.LocalDate;
import java.util.Arrays;
import java.util.Map;

import model.AttendanceService;
import model.Student;
import presenter.Presenter;
import view.AttendanceView;



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
        AttendanceView view = new AttendanceView();
        Presenter pr = new Presenter(view, serv);
        pr.run();
        }
    }
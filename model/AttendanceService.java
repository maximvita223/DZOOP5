package model;

import java.util.ArrayList;
import java.util.List;

public class AttendanceService {
    private List<Student> studentsTimesOff = new ArrayList<>();

    public AttendanceService(List<Student> studentsTimesOff) {
        this.studentsTimesOff = studentsTimesOff;
    }
    public List<Student> getList(){
        return studentsTimesOff;
    }
}

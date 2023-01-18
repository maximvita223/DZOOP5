package model;

import java.util.ArrayList;
import java.util.List;

public class AtterdanceService {
    private List<Student> studentsTimesOff = new ArrayList<>();

    public AtterdanceService(List<Student> studentsTimesOff) {
        this.studentsTimesOff = studentsTimesOff;
    }
    public List<Student> getList(){
        return studentsTimesOff;
    }
}

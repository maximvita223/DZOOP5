package model;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Student {
    private String name;
    Map<LocalDate, Boolean> attendance = new HashMap<>();

    public Student(String name, Map<LocalDate, Boolean> attendance) {
        this.name = name;
        this.attendance = attendance;
    }

    public String getName() {
        return name;
    }

    public Map<LocalDate, Boolean> getAttendance() {
        return attendance;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((attendance == null) ? 0 : attendance.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (attendance == null) {
            if (other.attendance != null)
                return false;
        } else if (!attendance.equals(other.attendance))
            return false;
        return true;
    }

}

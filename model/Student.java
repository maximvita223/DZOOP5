package model;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Student {
    private String name;
    Map<LocalDate, Boolean> map = new HashMap<>();

    public Student(String name, Map<LocalDate, Boolean> map) {
        this.name = name;
        this.map = map;
    }

    public String getName() {
        return name;
    }

    public Map<LocalDate, Boolean> getMap() {
        return map;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((map == null) ? 0 : map.hashCode());
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
        if (map == null) {
            if (other.map != null)
                return false;
        } else if (!map.equals(other.map))
            return false;
        return true;
    }

}

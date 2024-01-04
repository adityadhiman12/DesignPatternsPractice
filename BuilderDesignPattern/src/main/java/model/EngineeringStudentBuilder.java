package model;

import java.util.ArrayList;
import java.util.List;

public class EngineeringStudentBuilder extends  StudentBuilder{

    @Override
    public StudentBuilder setSubjects() {
        List<String>subs = new ArrayList<>();
        subs.add("DSA");
        subs.add("CSA");
        subs.add("OS");
        return this;
    }
}
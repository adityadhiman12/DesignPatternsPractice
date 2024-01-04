package model;

import java.util.ArrayList;
import java.util.List;

public class MBAStudentBuilder extends StudentBuilder{

    @Override
    public StudentBuilder setSubjects() {
        List<String> subs = new ArrayList<>();
        subs.add("economics");
        subs.add("business");
        subs.add("management");
        this.subjects=subs;
        return this;
    }
}

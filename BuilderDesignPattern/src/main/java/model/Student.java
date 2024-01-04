package model;

import java.util.List;

public class Student {
    private int rollNo;
    private int age;
    private String name;
    private String fatherName;
    private String motherName;
    List<String> subjects;
    public Student(StudentBuilder builder) {
        this.rollNo = builder.rollNo;
        this.age = builder.age;
        this.name = builder.name;
        this.motherName = builder.motherName;
        this.fatherName = builder.fatherName;
        this.subjects = builder.subjects;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", subjects=" + subjects +
                '}';
    }
}

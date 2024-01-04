package model;

public class Director {
    StudentBuilder studentBuilder;
    public Director(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent() {
        if(studentBuilder instanceof  EngineeringStudentBuilder) {
            return createEngineeringStudent();
        }
        else if(studentBuilder instanceof  MBAStudentBuilder) {
            return createMBAStudent();
        }
        return null;
    }
    private Student createEngineeringStudent() {
        return studentBuilder.setRollNo(2).setAge(23).setName("Aditya").setSubjects().build();
    }
    private Student createMBAStudent() {
        return studentBuilder.setRollNo(2).setAge(23).setName("Aditya D").setFatherName("hello").setSubjects().build();
    }
}

package Week5.PracticeWithClasses;

import java.util.List;

public class School {
   private String name;
   private String address;
   private List<Student> students;

    public School(String name,String address) {
        this.address = address;
        this.name = name;
    }

    public void addStudentToList(Student student){
        students.add(student);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}


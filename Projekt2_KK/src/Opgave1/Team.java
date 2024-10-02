package Opgave1;

import java.util.ArrayList;

public class Team {

    private String name;
    private String room;
    ArrayList<Student> studentList = new ArrayList<>();

    public Team(String name, String room) {
        this.name = name;
        this.room = room;
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public void removeStudent(String studentName) {
        studentList.remove(name);

    }

    public ArrayList<Student> activeStudentInTeam() {
        ArrayList<Student> activeStudent = new ArrayList<>();

        for (Student student : studentList) {
            if (student.isActive()) {
                activeStudent.add(student);
            }
        }
        return activeStudent;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public void removeStudentByName(String studentname) {

        for (Student student : studentList) {
            if (student.getName().equals(studentname)) {

                removeStudent(studentname);
            }
        }


}
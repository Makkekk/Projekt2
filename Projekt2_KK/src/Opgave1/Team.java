package Opgave1;

import java.util.ArrayList;

public class Team {

    private String name;
    private String room;
    private ArrayList<Student> studentList;

    public Team(String name, String room) {
        this.name = name;
        this.room = room;
        this.studentList = new ArrayList<>();
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }


    public void removeStudent(String studentName) {
       //Fjern students by name
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getNames().equals(studentName)) {
                studentList.remove(i);
                break; //Stop loopet
            }

        }

        studentList.remove(name);

    }


    public Student[] activeStudentInTeam() {
        ArrayList<Student> activeStudent = new ArrayList<>();

        for (Student student : studentList) {
            if (student.isActive()) {
                activeStudent.add(student);

            }
        }

        return activeStudent.toArray(new Student[0]); //konvertere Arraylist til et array.
    }


    public void removeStudentByName(String studentname) {
        for (Student student : studentList) {
            if (student.getNames().equals(studentname)) {

                removeStudent(studentname);
            }

        }
    }
    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    @Override
    public String toString() {
        String result = "Teamnavn: " + name + " : " + room + "\n students:\n";

        for (Student student : studentList) {
            result += " " + student + "\n";

        }
        return result;
    }
}

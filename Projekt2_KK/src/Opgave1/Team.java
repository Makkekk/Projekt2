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
            }
        }

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

    @Override
    public String toString() {
        String result = "Teamnavn: " + name + " : " + room + "\n students:\n";

        for (Student student : studentList) {
            result += " " + student + "\n";

        }
        return result;
    }

    public double gennemsnitTeam() {
        if (studentList == null) return 0;

        double totaleSumTeams = 0;
        for (Student student : studentList) {
            totaleSumTeams += student.studerendeGennemsnit();
        }

        return totaleSumTeams;
    }

    public Student[] highScoreStudents(double minAverage) {

        ArrayList<Student> highScores = new ArrayList<>();
        //Iterer over alle studerende i et team
        for (Student student : studentList) {
            if (student.isActive() && student.studerendeGennemsnit() >= minAverage) {
                highScores.add(student);
            }
        }
        return highScores.toArray(new Student[0]);
    }

    public String[] getStudentStatistics(char[] correctAnswer) {
        String[] stats = new String[studentList.size() + 1]; //WHY??

        stats[0] = String.format("%-20s %-10s %-10s", "Navn", "Gennemsnit", "Rigtige svar");

        for (int i = 0; i < studentList.size(); i++) {
            Student student = studentList.get(i);
            double average = student.studerendeGennemsnit();
            int correctcount = student.correctAnswers(correctAnswer);

            stats[i + 1] = String.format("%-20s %-10.2f %-10d", student.getNames(), average, correctcount);
        }
        return stats;
    }

}
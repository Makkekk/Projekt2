package Opgave1;

import java.util.ArrayList;

public class Team {

    private String name;
    private String room;
    private ArrayList<Student> studentList;
    private char[] correctAnswer;

    public Team(String name, String room, char[] svar) {
        this.name = name;
        this.room = room;
        this.studentList = new ArrayList<>();
        this.correctAnswer = svar;
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }


    public void removeStudent(String studentName) {
        //Fjern students by name
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getName().equals(studentName)) {
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
            if (student.getName().equals(studentname)) {

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
        String[] stats = new String[studentList.size() + 1];

        stats[0] = String.format("%-20s %-10s %-10s", "Navn", "Gennemsnit", "Rigtige svar");

        for (int i = 0; i < studentList.size(); i++) {
            Student student = studentList.get(i);
            double average = student.studerendeGennemsnit();
            int correctcount = student.correctAnswers(correctAnswer);
            stats[i + 1] = String.format("%-20s %-10.2f %-10d", student.getName(), average, correctcount);
        }
        return stats;
    }

    public int AnswerPerQuestion(int questionIndex) {
        int correctCount = 0;
        for (Student student : studentList) {
            if (student.isActive()) {
                if (student.getSvar()[questionIndex] == correctAnswer[questionIndex]) {
                    correctCount++;
                }
            }
        }

        return correctCount;
    }
    public void printAnswerPerQuestion(){

        for (int i = 0; i < correctAnswer.length; i++) {
            int count = AnswerPerQuestion(i);
            System.out.printf("Question %d: Correct Answer = '%c', Correctly answered by %d students%n", (i + 1), correctAnswer[i], count);
        }
    }
}
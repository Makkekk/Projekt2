package Opgave1;

import java.util.Arrays;
import java.util.Random;

public class Student {
    private String name;
    private boolean active;
    private int[] grades;
    private char[] svar;

    //Konstanter
    private static final char[] MULIGHEDER = {'A', 'B', 'C', 'D'};
    private static final int ANTAL_SPØRGSMÅL = 10;

    public Student(String name, boolean active, int[] grades) {
        this.name = name;
        this.active = active;
        this.grades = grades;
        this.svar = new char[10];
    }

    public String getName() {
        return name;
    }

    public boolean isActive() {
        return active;
    }

    @Override
    public String toString() {
        String activitystatus;
        if (active) {
            activitystatus = "Aktiv";
        } else {
            activitystatus = "Inaktiv";
        }

        return "Elevens navn: = " + name + ", Studieaktivitet: " + activitystatus + ", Karakter " + Arrays.toString(grades);

    }

    //Udskriv den studerende med højeste karakter// I tvivl om den ikke bare tag det næste højeste tal der kommer i rækkefølgen og stopper-
    public int getHøjestekarakter() {
        int højesteKarakter = grades[0];
        for (int grade : grades) {
            if (grade > højesteKarakter) {
                højesteKarakter = grade;
            }
        }
        return højesteKarakter;
    }

    // Gennemsnit
    public double studerendeGennemsnit() {
        if (grades.length == 0)
            return 0;

        double sumAfGennemsnit = 0;
        for (int grade : grades) {
            sumAfGennemsnit += grade;
        }

        return (double) sumAfGennemsnit / grades.length;
    }

    public void GenererRandomSvar() {
        Random random = new Random();
        for (int i = 0; i < ANTAL_SPØRGSMÅL; i++) {
            svar[i] = MULIGHEDER[random.nextInt(MULIGHEDER.length)];
        }
    }

    public char[] getSvar() {
        return svar;

    }

    public int correctAnswers(char[] correct) {

        int correctCount = 0;
        char[] studentSvar = this.getSvar();

        if (correct.length != studentSvar.length) {
            System.out.println("Error, Der er flere svar end der er korrekte spørgsmål.");

            return 0;
        }

        //Gør brug af for loopet fordi for each ikke kan tjekke begge loops på samme tid.?
        for (int i = 0; i < correct.length; i++) {
            if (studentSvar[i] == correct[i]) {
                correctCount++;
            }
        }
        return correctCount;
    }
}
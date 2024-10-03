package Opgave1;

import java.util.Arrays;
import java.util.Random;

public class Student {
    private String names;
    private boolean active;
    private int[] grades;
    private char[] svar;

    //Konstanter
    private static final char[] MULIGHEDER = {'A', 'B', 'C', 'D'};
    private static final int Nummer_Af_Spørgsmål = 10;

    public Student(String name, boolean active, int[] grades) {
        this.names = name;
        this.active = active;
        this.grades = grades;
        this.svar = new char[Nummer_Af_Spørgsmål];
    }

    public String getNames() {
        return names;
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

        return "Elevens navn: = " + names + ", Studieaktivitet: " + activitystatus + ", Karakter " + Arrays.toString(grades);

    }

    //Udskriv den studerende med højeste karakter
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
        for (int i = 0; i < Nummer_Af_Spørgsmål; i++) {
            svar[i] = MULIGHEDER[random.nextInt(MULIGHEDER.length)];
        }
    }

    public char[] getSvar() {
        return svar;

    }
}
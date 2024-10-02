package Opgave1;

import java.security.PublicKey;
import java.util.Arrays;

public class Student {
    private String names;
    private boolean active;
    private int[] grades;


    public Student(String name, boolean active, int[] grades) {
        this.names = name;
        this.active = active;
        this.grades = grades;

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
    public  int getHøjestekarakter() {
        int højesteKarakter = grades[0];
        for (int grade : grades) {
            if (grade > højesteKarakter) {
                højesteKarakter = grade;
            }
        }
        return højesteKarakter;
    }

}




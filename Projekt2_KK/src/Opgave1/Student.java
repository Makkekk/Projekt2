package Opgave1;

import java.util.Arrays;

public class Student {
    private String name;
    private boolean active;
    private int[] grades;

    public void student(String name, boolean active, int[] grades) {
        this.name = name;
        this.active = active;
        this.grades = grades;

    }

    public void printStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("status" + active);
        System.out.println("Grade" + grades);
    }

    public boolean isActive() {
        return active;
    }

    public String getName() {
        return name;

    }
}


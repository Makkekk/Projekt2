package Opgave1;

public class App {
    public static void main(String[] args) {

        Team team1 = new Team("Team1", "1" );
        Team team2 = new Team ("Team2", "2");

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();
        Student student6 = new Student();

        student1.setName("Børge");
        student1.setActive(true);
        student1.setGrades(new int[] {2,4,12});

        student1.setName("Biver");
        student1.setActive(true);
        student1.setGrades(new int[] {4,4,4});

        student1.setName("Bent betjent");
        student1.setActive(true);
        student1.setGrades(new int[] {7,7,7});

        student1.setName("Anne");
        student1.setActive(true);
        student1.setGrades(new int[] {4,7,12});

        student1.setName("Sanne");
        student1.setActive(true);
        student1.setGrades(new int[] {12,12,12});

        student1.setName("Lis");
        student1.setActive(true);
        student1.setGrades(new int[] {3,1,2});

        team1.addStudent(student1);
        team1.addStudent(student2);
        team1.addStudent(student3);
        team2.addStudent(student4);
        team2.addStudent(student5);
        team2.addStudent(student6);


        System.out.println(team1);
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);


    }
}

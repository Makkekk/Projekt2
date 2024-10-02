package Opgave1;

public class App {
    public static void main(String[] args) {

        Team team1 = new Team("Team1 ", "rum 1 ");
        Team team2 = new Team("Team2 ", "rum 47 ");

        Student Student1 = new Student("Børge", true, new int[]{2, 4, 7});
        Student Student2 = new Student("Biver", true, new int[]{4, 4, 4});
        Student Student3 = new Student("Bent Betjent", false, new int[]{7, 7, 7});
        Student Student4 = new Student("Anne", false, new int[]{4, 7, 12});
        Student Student5 = new Student("Sanne", true, new int[]{12, 12, 12});
        Student Student6 = new Student("Lis", true, new int[]{4, 1, 2});

        //Add student
        team1.addStudent(Student1);
        team1.addStudent(Student2);
        team1.addStudent(Student3);
        team2.addStudent(Student4);
        team2.addStudent(Student5);
        team2.addStudent(Student6);


        System.out.println(team1);
        System.out.println(team2);

        //Test af metoder på et team
        System.out.println("Aktive studerende i Team1");
        for (Student student : team1.activeStudentInTeam()) {
            System.out.println(student);

        }
        System.out.println("\nFjern studerende Børge fra team 1");
        team1.removeStudent("børge");

        //Se ændringen efter børge er væk
        System.out.println(team1);


        System.out.println("Højeste karater for: " + Student1.getNames() + ": " + Student1.getHøjestekarakter());
        System.out.println("Højeste karater for: " + Student2.getNames() + ": " + Student2.getHøjestekarakter());
        System.out.println("Højeste karater for: " + Student3.getNames() + ": " + Student3.getHøjestekarakter());
        System.out.println("Højeste karater for: " + Student4.getNames() + ": " + Student4.getHøjestekarakter());
        System.out.println("Højeste karater for: " + Student5.getNames() + ": " + Student5.getHøjestekarakter());
        System.out.println("Højeste karater for: " + Student6.getNames() + ": " + Student6.getHøjestekarakter());
    }
}


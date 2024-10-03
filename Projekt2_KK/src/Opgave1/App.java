package Opgave1;


import java.util.Arrays;


public class App {
    public static void main(String[] args) {

        Team team1 = new Team("Team1 ", "rum 1 ");
        Team team2 = new Team("Team2 ", "rum 47 ");

        Student Student1 = new Student("Børge", true, new int[]{2, 4, 7});
        Student Student2 = new Student("Biver", true, new int[]{7, 7, 7});
        Student Student3 = new Student("Bent Betjent", false, new int[]{7, 7, 12});
        Student Student4 = new Student("Anne", true, new int[]{4, 7, 12});
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
        System.out.println("\nFjern studerende" + ", indtast navn: ");
        team1.removeStudent("");

        //Se ændringen efter børge er væk
        System.out.println(team1);


        //Statestik for aktive i teams 1
        System.out.println("\n  Statestik for team 1");
        for (Student student : team1.activeStudentInTeam()) {
            System.out.println("Højeste karater for: " + student.getNames() + " = " + student.getHøjestekarakter());
            System.out.println("Gennemsnit for studerende:" + student.getNames() + " : " + student.studerendeGennemsnit() + System.lineSeparator());
        }
        //Statestik for aktive i teams 2
        System.out.println("\n  Statestik for team 2");
        for (Student student : team2.activeStudentInTeam()) {
            System.out.println("Højeste karater for: " + student.getNames() + " = " + student.getHøjestekarakter());
            System.out.println("Gennemsnit for studerende : " + student.getNames() + " = " + student.studerendeGennemsnit() + System.lineSeparator());

        }
        System.out.println("Samlet Gennemsnit af team1: " + team1.gennemsnitTeam() + System.lineSeparator());
        System.out.println("Samlet Gennemsnit af team2: " + team2.gennemsnitTeam());


        double minAverage = 2.0;
        System.out.println("Aktive studerende med et gennemsnit på eller over :" + minAverage + ":\n");

        Student[] highScoreStudents1 = team1.highScoreStudents(minAverage);
        System.out.println("Team 1");
        for (Student highScoreStudent : highScoreStudents1)
            System.out.println(highScoreStudent.getNames() + " with an average of " + highScoreStudent.studerendeGennemsnit());

        Student[] highScoreStudents2 = team2.highScoreStudents(minAverage);
        System.out.println("\nTeam 2");
        for (Student highScoreStudent : highScoreStudents2)
            System.out.println(highScoreStudent.getNames() + " with an average of " + highScoreStudent.studerendeGennemsnit());

        //Random svar test
        System.out.println("\nRandom svar test på student1");
        Student1.GenererRandomSvar();
        System.out.println(Student1.getSvar());


        System.out.println("\nSvar fra studerende i team 1(Random)\n");
        for (Student student : team1.activeStudentInTeam()) {
            student.GenererRandomSvar();
            System.out.println(student.getNames() + " Svar: " + Arrays.toString(student.getSvar()));
        }

        System.out.println("\nSvar fra studerende i team 2(Random)\n");
        for (Student student : team2.activeStudentInTeam()) {
            student.GenererRandomSvar();
            System.out.println(student.getNames() + " svar: " + Arrays.toString(student.getSvar()));

        }
        System.out.println();

        //Rigtige svar
        char[] correctSvar = {'A', 'B', 'C', 'D', 'D', 'C', 'B', 'A', 'D', 'A'};
        System.out.println("Den studerendes svar: " + Arrays.toString(Student1.getSvar()));

        int correctCount = Student1.correctAnswers(correctSvar);
        System.out.println("Antal korrekte svar for " + Student1.getNames() + ": " + correctCount + System.lineSeparator());

        // Print stats for studerende i team 1
        System.out.println("\nStatistik for studerende i Team 1:");
        String[] team1Stats = team1.getStudentStatistics(correctSvar);
        for (String stats : team1Stats) {
            System.out.println(stats);

        }
        System.out.println("\nStatistik for studerende i Team 2:");
        String[] team2Stats = team2.getStudentStatistics(correctSvar);
        for (String stats : team1Stats) {
            System.out.println(stats);
        }
    }
}

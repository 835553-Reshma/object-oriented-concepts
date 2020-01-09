package section3;

import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        String teamName;
        int noOfMatches;
        System.out.println("1.Cricket Player Details\n2.Hockey Player Details");
        System.out.println("Enter the choice");
        int choice = sc.nextInt();
        sc.nextLine();
        if (choice == 1) {
            System.out.println("Enter player name");
            name = sc.nextLine();
            System.out.println("Enter team name");
            teamName = sc.nextLine();
            System.out.println("Enter number of matches played");
            noOfMatches = sc.nextInt();
            System.out.println("Enter total runs scored");
            int totalRunsScored = sc.nextInt();
            System.out.println("Enter total number of wickets taken");
            int noOfWicketsTaken = sc.nextInt();
            CricketPlayer cricket = new CricketPlayer(name, teamName, noOfMatches, totalRunsScored,
                    noOfWicketsTaken);
            cricket.displayPlayerStatistics();

        }
        if (choice == 2) {
            System.out.println("Enter player name");
            name = sc.nextLine();
            System.out.println("Enter team name");
            teamName = sc.nextLine();
            System.out.println("Enter number of matches played");
            noOfMatches = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the position");
            String position = sc.nextLine();
            System.out.println("Enter total number of goals taken");
            int noOfGoals = sc.nextInt();
            HockeyPlayer hockey = new HockeyPlayer(name, teamName, noOfMatches, position,
                    noOfGoals);
            hockey.displayPlayerStatistics();

        }
        sc.close();

    }

}

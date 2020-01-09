package section3;

public class CricketPlayer extends Player implements IPlayerStatistics {

    private long totalRunsScored;
    private long noOfWicketsTaken;

    public CricketPlayer(String name, String teamName, long noOfMatches, long totalRunsScored,
            long noOfWicketsTaken) {
        super(name, teamName, noOfMatches);
        this.totalRunsScored = totalRunsScored;
        this.noOfWicketsTaken = noOfWicketsTaken;
    }

    @Override
    public void displayPlayerStatistics() {

        System.out.println("Player Details");
        System.out.println("Player name:" + name);
        System.out.println("Team name:" + teamName);
        System.out.println("No of matches:" + noOfMatches);
        System.out.println("Total runsscored:" + totalRunsScored);
        System.out.println("No of wickets taken:" + noOfWicketsTaken);

    }

}

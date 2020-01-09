package section3;

public abstract class Player {
    protected String name;
    protected String teamName;
    protected long noOfMatches;

    public Player(String name, String teamName, long noOfMatches) {
        super();
        this.name = name;
        this.teamName = teamName;
        this.noOfMatches = noOfMatches;
    }

}

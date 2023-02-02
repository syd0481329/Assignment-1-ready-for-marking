public class Player {
    //Properties of players
    private String playerName;
    private int goals;
    private int assists;
    private int totalGoalAssist = goals + assists;

    //Constructor of player
    public Player(String name, int goals, int assists){
        this.playerName = name;
        this.goals = goals;
        this.assists = assists;
    }
    //methods
    public void outputPlayerDetails(){
        System.out.println(playerName + ":" + "G - " + this.goals + "A - " + this.assists + "Total - " + totalGoalAssist);
    }
}

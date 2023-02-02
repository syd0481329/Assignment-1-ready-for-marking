import java.util.Random;
public class Team {
    //Properties of a team
    private String teamName;
    int budgetMin = 0; // Minimum value of range
    int budgetMax = 100000; // Maximum value of range
    // Generate random int value from min to max
    int budget = (int)Math.floor(Math.random() * (budgetMax - budgetMin + 1) + budgetMin);

    //Constructor
    public Team(String teamName, int budget){
        this.teamName = teamName;
    }
    public Team(String teamName){
        this.teamName = teamName;
    }
    //methods
    public void outputTeamName(){
        this.teamName = teamName;
        System.out.println(teamName);
    }

public void outputTeamDetails() {
    System.out.println(teamName +"Budget: $" +budget);

}

}

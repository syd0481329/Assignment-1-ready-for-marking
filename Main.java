//I know what I would do differently to make this work.
//Unfortunately I just don't have the time to fix it without losing more marks for lateness.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int budgetMin = 0; // Minimum value of range
        int budgetMax = 100000; // Maximum value of range
        String teamName;
        String playerName = "";
        int goals;
        int assists;
        int budget;
        //Start of application heading
            System.out.println("FANTASY HOCKEY APPLICATION");
            System.out.println("TEAM ENTRY");
            System.out.println("================================");


        //Scanner
            Scanner scan = new Scanner(System.in);
        //for loop for creating team names
        //I tried to make this work as a loop but I think I need to make some arrays to make this work better
            for(int i = 1; i < 4; i++) {
                //DATA VALIDATION
                boolean isValidInput = false;
                while (!isValidInput) {
                    System.out.println("Enter name of team # " + i);
                    if (scan.hasNext()) {
                        teamName = scan.nextLine();
                        if (teamName.length() >= 3) {
                            isValidInput = true;
                        } else {
                            System.out.println("Team name must be greater than 3 letters");
                            scan.next();
                        }

                    // Generate random int value from min to max
                    budget = (int) Math.floor(Math.random() * (budgetMax - budgetMin + 1) + budgetMin);
                    Team one = new Team(teamName, budget);
                }
            }
            }

        //player entry section
        //same issue with arrays as above
        System.out.println("PLAYER ENTRY");
        System.out.println("================================");
        for(int i = 1; i < 4; i++) {
            System.out.println("Enter players for team " + i); // supposed to say each team name
            //DATA VALIDATION
            boolean isOkayInput = false;
            while (!isOkayInput) {
                for (int j = 1; j < 4; j++) {
                    System.out.println("Enter name for player # " + j);
                    System.out.println("Enter number of goals for " + playerName);
                    goals = scan.nextInt();
                    System.out.println("Enter number of assists for " + playerName);
                    assists = scan.nextInt();
                    Player one = new Player(playerName, goals, assists);
                    //star ranking logic
                    int starRank = goals + assists;
                    if (starRank == 0) {
                        System.out.println("0");
                    } else if (starRank > 0 && starRank < 10) {
                        System.out.println("*");
                    } else if (starRank >= 10 && starRank < 20) {
                        System.out.println("**");
                    } else {
                        System.out.println("***");
                    }
                }

            }
//if my arrays were set up at all, I would be printing info for team one, two, and three
            //same with printing player info
            System.out.println("REPORT: Stats per Team");
            System.out.println("================================");
            one.outputTeamDetails();

            System.out.println("REPORT: Stats per Player");
            System.out.println("================================");
            one.outputPlayerDetails();

        }
    }
}
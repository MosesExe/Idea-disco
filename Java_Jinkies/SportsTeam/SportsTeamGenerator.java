import java.util.ArrayList;
import java.util.Random;

public class SportsTeamGenerator {
    public static void main (String args[]){
        // Could probably move this somewhere else enum maybe?
        String[] playerNames = {"David", "Serill", "Garrey", "Atapattu", "Ateeq", "Athol", "Edwin", "Edwyn", "Eesa"};
        Team teamA = new Team(playerGenerator(playerNames));
        printTeamRoster(teamA);
    }
    /* Function that takes in string array of player names and generates random stats for them.
    Future fun function: Check against the teamRoster to see if there's already an assigned playernumber */
    public static ArrayList<Player> playerGenerator (String[] name){
        Random rd = new Random();
        ArrayList<Player> teamRoster = new ArrayList<Player>();
        for(int i = 0; i<name.length; i++){
            Player dude= new Player(name[i],
                (int)(rd.nextInt(45-20)+20),
                (int)(rd.nextInt(99-0)+0),
                String.format("%.2f",
                (float)(Math.random()*(350-210)+210)));
            teamRoster.add(dude);
        }
        return teamRoster;
    }

    static void printTeamRoster(Team team){
        System.out.println();
        System.out.println();
        System.out.println("Team Name: "+ team.getTeamName());
        System.out.println("-----------------------------------------------------------------------------");
        System.out.printf("%10s %20s %10s %10s %20s", "Name", "Age", "Jersey", "Weight", "Starting: ");
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------");
        for(Player player: team.teamRoster){
            System.out.format("%10s %20s %10s %10s %20s", 
                player.getName(), player.getAge(), player.getPlayerNumber(),player.getWeight(),player.getIsStarting());
            System.out.println();
        }
        System.out.println("-----------------------------------------------------------------------------");
    }
    
}
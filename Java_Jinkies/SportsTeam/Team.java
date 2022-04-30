import java.util.ArrayList;
import java.util.Random;

class Team {
    // Encapsuation example
    private String teamName;
    // private int teamSize;
    ArrayList<Player> teamRoster;
    
    public Team(){}
    public Team ( ArrayList<Player> teamRoster){
        this.teamName = this.getTeamName();
        // this.teamSize = teamSize;
        this.teamRoster = teamRoster;
    }

    public String getTeamName(){
        return this.teamNamePicker();
    }

    // public int getTeamSize(){
    //     return this.teamSize;
    // }

    public ArrayList<Player> getTeamRoster(){
        return this.teamRoster;
    }

    private String teamNamePicker (){
        String[] avaliableNames = {"Abbott Elementary", "Abernathy Annihilators", "Abilene Tabaxis","Tigers","Creature Creepers", "Credit Consolidators","Seagull","Samurai","Street","Bruno","Wolverines","Table Tyrants", "Horse riding Horses"};
        return avaliableNames[new Random().nextInt(avaliableNames.length)];
    }
}

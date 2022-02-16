package RankingPoints;

import javax.swing.*;
import java.util.Comparator;
import java.util.Comparator;


public class FootballTeam  implements Teams,Comparator<FootballTeam> {
    private String TeamName;
    private int Points;
    private String Sponsor;

    public FootballTeam(){
        String TeamName = "";
        int Points=0;
        String Sponser;
    }

    public FootballTeam(String teamName, int points, String sponsor) {
        this.TeamName = teamName;
        this.Points = points;
        this.Sponsor = sponsor;
    }

    @Override
    public String getTeamName() {
        return this.TeamName;
    }

    @Override
    public void updatePoints(String Result) {
        if(Result.equals("Win")){
            this.Points +=3;
        }else {
            this.Points += 1;
        }
    }


    @Override
    public Integer getPoints() {
        return this.Points;
    }

    @Override
    public int compare(FootballTeam o1, FootballTeam o2) {
        return o1.getPoints()-o2.getPoints();
    }
}

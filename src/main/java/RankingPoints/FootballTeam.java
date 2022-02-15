package RankingPoints;

import javax.swing.*;

public class FootballTeam {
    private String TeamName;
    private int Points;
    private String Sponsor;

    public FootballTeam(String teamName, int points, String sponsor) {
        TeamName = teamName;
        Points = points;
        Sponsor = sponsor;
    }

    public  void updatePoints() {

    }

    public String getTeamName() {
        return TeamName;
    }

    public int getPoints() {
        return Points;
    }

}

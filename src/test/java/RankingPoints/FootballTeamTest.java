package RankingPoints;

import org.junit.Test;

import static org.junit.Assert.*;

public class FootballTeamTest {
    FootballTeam footballTeam;
    FootballTeam footballTeam1;
    @Test
    public void getTeamName() {
        footballTeam=new FootballTeam("Chelsea",33,"Happy Foot");
        assertEquals("Chelsea",footballTeam.getTeamName());
    }

    @Test
    public void updatePoints() {
        footballTeam=new FootballTeam("Chelsea",33,"Happy Foot");
        footballTeam.updatePoints("Win");
        assertEquals(36,footballTeam.getPoints(),0);
    }

    @Test
    public void getPoints() {
        footballTeam=new FootballTeam("Chelsea",33,"Happy Foot");
        assertEquals(33,footballTeam.getPoints(),0);
    }

    @Test
    public void compare() {
        footballTeam=new FootballTeam("Chelsea",33,"Happy Foot");
        footballTeam1=new FootballTeam("Liverpool",45,"Happy Foot");
        footballTeam.compare(footballTeam,footballTeam1);
        footballTeam.updatePoints("Drawn");
        assertEquals(34,footballTeam.getPoints(),0);
    }
}
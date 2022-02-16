package RankingPoints;

import org.junit.Test;

import static org.junit.Assert.*;

public class BasketballTeamTest {
    BasketballTeam basketballTeam;
    BasketballTeam basketballTeam1;
    @Test
    public void getTeamName() {
        basketballTeam=new BasketballTeam("Boston Celtics",10);
        assertEquals("Boston Celtics",basketballTeam.getTeamName());
    }

    @Test
    public void updatePoints() {
        basketballTeam=new BasketballTeam("Boston Celtics",10);
        basketballTeam.updatePoints("Win");
        assertEquals(12,basketballTeam.getPoints(),0);
    }

    @Test
    public void getPoints() {
        basketballTeam=new BasketballTeam("Boston Celtics",10);
        assertEquals(10,basketballTeam.getPoints(),0);
    }

    @Test
    public void compare() {
        basketballTeam=new BasketballTeam("Boston Celtics",10);
        basketballTeam1=new BasketballTeam("Boston Celtics",12);
        basketballTeam.compare(basketballTeam,basketballTeam1);
        basketballTeam.updatePoints("Win");
        assertEquals(12,basketballTeam.getPoints(),0);
    }
}
package RankingPoints;
import java.util.Comparator;
public class BasketballTeam implements Teams,Comparator<BasketballTeam>{
    private String TeamName;
    private int Points;
    private boolean updated=false;

    public BasketballTeam(){
        String TeamName="";
        int Points=0;
    }

    public BasketballTeam(String teamName, int points) {
        this.TeamName = teamName;
        this.Points = points;
    }


    @Override
    public String getTeamName() {
        return this.TeamName;
    }

    @Override
    public void updatePoints(String Result) {
        if(Result.equals("Win")){
            this.Points +=2;
            updated=true;
        }
    }
    public boolean isUpdated(){
        if(updated==true){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public Integer getPoints() {
        return this.Points;
    }

    @Override
    public int compare(BasketballTeam o1, BasketballTeam o2) {
        return o1.getPoints()-o2.getPoints();
    }
}

package RankingPoints;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class Main {

    public static void main(String[] args) {
        String line = "";
        ArrayList<FootballTeam> footballTeam1 = new ArrayList<FootballTeam>();
        ArrayList<BasketballTeam> basketballTeam1 = new ArrayList<BasketballTeam>();

        BasketballTeam basketballTeam;
        FootballTeam footballTeam;

        //Load Teams.csv
        try
        {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\246714\\IdeaProjects\\JavaLab_Excercise_Part1\\src\\main\\resources\\teams.csv"));
            while ((line = br.readLine()) != null)
            {
                String TeamRecord[] = line.split(",");
                if(TeamRecord[0].equals("Basketball")){
                    basketballTeam= new BasketballTeam(TeamRecord[1],Integer.parseInt(TeamRecord[2]));
                    basketballTeam1.add(basketballTeam);

                }
                if(TeamRecord[0].equals("Football")){
                    footballTeam= new FootballTeam(TeamRecord[1],Integer.parseInt(TeamRecord[2]),TeamRecord[3]);
                    footballTeam1.add(footballTeam);
                }
            }

        } catch (IOException e)
        {
            e.printStackTrace();
        }

        //Sorted Record of Football Team
        System.out.println("Standing of Football teams = ");
        Collections.sort(footballTeam1,new FootballTeam());
        for (int i=0; i<footballTeam1.size(); i++) {
            System.out.println("Team Name = "+footballTeam1.get(i).getTeamName() +" , "+" Points = "+footballTeam1.get(i).getPoints());
        }

        //Sorted Record of BasketBall Team
        System.out.println("Standing of Basketball teams = ");
        Collections.sort(basketballTeam1,new BasketballTeam());
        for (int i=0; i<basketballTeam1.size(); i++) {
            System.out.println("Team Name = "+basketballTeam1.get(i).getTeamName() +" , "+" Points = "+basketballTeam1.get(i).getPoints());
        }


        ArrayList<String[]> ResultArray = new ArrayList<>();
        //Load Result.csv
        try
        {

            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\246714\\IdeaProjects\\JavaLab_Excercise_Part1\\src\\main\\resources\\results.csv"));
            while ((line = br.readLine()) != null)
            {

                String resultRecord[] = line.split(",");
                ResultArray.add(resultRecord);
            }

            } catch (IOException e)
            {
                e.printStackTrace();
            }


        for(int i=0;i<ResultArray.size();i++){
                        for(int k=0;k<footballTeam1.size();k++){
                if(footballTeam1.get(k).getTeamName().equals(ResultArray.get(i)[0])){
                    footballTeam1.get(k).updatePoints(ResultArray.get(i)[1]);
                }
            }
        }
        for(int i=0;i<ResultArray.size();i++){
            for(int k=0;k<basketballTeam1.size();k++){
                    if(basketballTeam1.get(k).getTeamName().equals(ResultArray.get(i)[0])){
                        basketballTeam1.get(k).updatePoints(ResultArray.get(i)[1]);
                    }
                }
        }

        //Sorted Record of Football Team after adding points
        System.out.println("Standing of After Updating Football teams Score= ");
        Collections.sort(footballTeam1,new FootballTeam());
        for (int i=0; i<footballTeam1.size(); i++) {
            System.out.println("Team Name = "+footballTeam1.get(i).getTeamName() +" , "+" Points = "+footballTeam1.get(i).getPoints());
        }


        //Sorted Record of Football Team after adding points
        System.out.println("Standing of  After Updating Basketball teams Score= ");
        Collections.sort(basketballTeam1,new BasketballTeam());
        for (int i=0; i<basketballTeam1.size(); i++) {
            System.out.println("Team Name = "+basketballTeam1.get(i).getTeamName() +" , "+" Points = "+basketballTeam1.get(i).getPoints());
        }
    }
}


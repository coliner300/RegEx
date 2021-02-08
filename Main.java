import java.util.Scanner;

public class Main
{
  private String bestPlayers; //letters
  private String bestTeams; //letters
  private String records; //numbers
  private String websites; //special characters
  private final Scanner scan = new Scanner(System.in);


public Main(String bestPlayers, String bestTeams, String records, String websites)
{
  this.bestPlayers = checkBestPlayers(bestPlayers);
  this.bestTeams = checkBestTeams(bestTeams);
  this.records = checkRecords(records);
  this.websites = checkWebsites(websites);
}//end constructor

}//end class main
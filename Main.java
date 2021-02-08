public class Main
{
  public static void main(String[] args)
  {
    Driver miscellaneous = new Driver("Barry", "Yankees", "mlb@baseball.net", "(808)452-8456");
    System.out.println(miscellaneous.toString());

    //test bestPlayers
    System.out.println("\nSet Best Player to Barry Bonds");
    miscellaneous.setBestPlayers("Barry Bonds");
    System.out.println("Set Best Player to Barry1234");
    miscellaneous.setBestPlayers("Barry1234");
    System.out.println("Set Best Player to: " + miscellaneous.getBestPlayers());

    //test bestTeams
    System.out.println("\nSet Best Team to Yankees and Dodgers");
    miscellaneous.setBestTeams("Yankees and Dodgers");
    System.out.println("Set Best Team to Yankees1234");
    miscellaneous.setBestTeams("Yankees1234");
    System.out.println("Set Best Team to: " + miscellaneous.getBestTeams());

    //test websites
    System.out.println("\nSet Website to mlb@gmail.123");
    miscellaneous.setWebsites("mlb@gmail.123");
    System.out.println("Set Website to mlb@gmail.xyz");
    miscellaneous.setWebsites("mlb@gmail.xyz");
    System.out.println("Set Website to: " + miscellaneous.getWebsite());

    //test support
    System.out.println("\nSet Support to 951-654-3210");
    miscellaneous.setSupport("951-654-3210");
    System.out.println("Set Support to (951)765-43210");
    miscellaneous.setSupport("(951)765-43210");
    System.out.println("Set Support to: " + miscellaneous.getSupport());
  }
}

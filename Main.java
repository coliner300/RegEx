public class Main
{
  public static void main(String[] args)
  {
    Driver miscellaneous = new Driver("Barry", "Yankees", "mlb@baseball.net", "(808)452-8456");
    System.out.println(miscellaneous.toString());
  }
}


// import java.util.Scanner;

// public class Main
// {
//   private String bestPlayers; //letters
//   private String bestTeams; //letters
//   private String websites; //special characters
//   private String support; //numbers
//   private final Scanner scan = new Scanner(System.in);


// public Main(String bestPlayers, String bestTeams, String records, String websites)
// {
//   this.bestPlayers = checkBestPlayers(bestPlayers);
//   this.bestTeams = checkBestTeams(bestTeams);
//   this.websites = checkWebsites(websites);
//   this.support = checkSupport(support);
// }//end constructor

// public String getBestPlayers()
// {
//   return bestPlayers;
// }
// public String getBestTeams()
// {
//   return bestTeams;
// }
// public String getWebsites()
// {
//   return websites;
// }
// public String getSupport()
// {
//   return support;
// }

// public void setBestPlayers()
// {
//   this.bestPlayers = checkBestPlayers(bestPlayers);
// }
// public void setBestTeams()
// {
//   this.bestTeams = checkBestTeams(bestTeams);
// }
// public void setWebsites()
// {
//   this.websites = checkWebsites(websites);
// }
// public void setSupport()
// {
//   this.support = checkSupport(support);
// }


// private String checkBestPlayers(String name)
// {
//   while(!name.matches("[A-Z][A-Za-z]+"))
//   {
//     System.out.println("Best Players: Invalid, please type correctly");
//     bestPlayers = scan.next();
//   }
//   return bestPlayers;
// }

// private String checkBestTeams(String name)
// {
//   while(!name.matches("[A-Z][A-Za-z]+"))
//   {
//     System.out.println("Best Teams: Invalid, please type correctly");
//     bestTeams = scan.next();
//   }
//   return bestTeams;
// }

// private String checkWebsites(String email)
// {
//   while(!email.matches("[A-Za-z0-9]+@[a-z]+\\.(com|net|edu)"))
//   {
//     System.out.println("Websites: Invalid, please type correctly");
//     websites = scan.next();
//   }
//   return websites;
// }

// private String checkSupport(String num)
// {
//   while(!num.matches("[0-9]{3}-[0-9]{3}-[0-9]{4}))"))
//   {
//     System.out.println("Support Number: Invalid, please type correctly");
//     support = scan.next();
//   }
//   return support;
// }

// public String toString()
// {
//   String output;
//   output = "Best Players: " + bestPlayers;
//   output += "\nBest Teams: " + bestTeams;
//   output += "\nSupport: " + support;
//   output += "\nWebsites: " + websites;
//   return output;
// }

// }//end class main
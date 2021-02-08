import java.util.Scanner;

public class Driver
{
    private String bestPlayers;
    private String bestTeams;
    private String websites;
    private String support;
    private final Scanner scan = new Scanner(System.in);

    public Driver(String bestPlayers, String bestTeams, String websites, String support)
    {
        this.bestPlayers = checkBestPlayers(bestPlayers);
        this.bestTeams = checkBestTeams(bestTeams);
        this.websites = checkWebsite(websites);
        this.support = checkSupport(support);
    }

    public String getBestPlayers() 
    { 
      return bestPlayers; 
    }

    public String getBestTeams() {
        return bestTeams;
    }

    public String getWebsite() 
    { 
      return websites; 
    }
    public String getSupport() 
    { 
      return support; 
    }


    public void setBestPlayers(String bestPlayers) 
    {
        this.bestPlayers = checkBestPlayers(bestPlayers);
    }

    public void setBestTeams(String bestTeams) 
    {
        this.bestTeams = checkBestTeams(bestTeams);
    }

    public void setWebsites(String websites) 
    {
        this.websites = checkWebsite(websites);
    }

    public void setSupport(String support)
    {
        this.support = checkSupport(support);
    }

    private String checkBestPlayers(String name)
    {
        while(!name.matches("[A-Z][A-Za-z]+"))
        {
            System.out.println("Best Players: Invalid , please type correctly");
            name = scan.next();
        }
        return name;
    }

    private String checkBestTeams(String name)
    {
        while(!name.matches("[A-Z]([A-Za-z]|-)+"))
        {
            System.out.println("Best Teams: Invalid , please type correctly");
            name = scan.next();
        }
        return name;
    }

   
    private String checkWebsite(String email)
    {
        while(!email.matches("[A-Za-z0-9]+@[a-z]+\\.(com|net|edu)"))
        {
            System.out.println("Websites: Invalid , please type correctly");
            email = scan.next();
        }
        return email;
    }

    private String checkSupport(String num)
    {
        while(!num.matches("\\([0-9]{3}\\)[0-9]{3}-[0-9]{4}"))
        {
            System.out.println("Support: Invalid , please type correctly");
            num = scan.next();
        }
        return num;
    }

    public String toString()
    {
        String output;
        output  = "Best Player(First Name): " + bestPlayers;
        output += "\nBest Teams: " + bestTeams;
        output += "\nWebsite: " + websites;
        output += "\nSupport: " + support;
        return output;
    }
}
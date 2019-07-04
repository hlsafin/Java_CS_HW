//Warning: Do not change the given codes
import java.util.*;
import java.math.*;


public class NBA {
public static void main(String[] args) {
//construct Team Heat
NBATeam heat= new NBATeam("Heats");
System.out.print("How many players Heats own: ");
Scanner input = new Scanner (System.in);
 int numberOfPlayers = input.nextInt();
 heat.get(numberOfPlayers);

 

// Prompt user to enter players into the Team
for (int i = 0; i < numberOfPlayers; i++) {
      System.out.print("Enter the name of Player #" + (i + 1) + ": ");
      String playerName = input.next();     
      heat.addAPlayer(playerName);
}
NBATeam spurs= new NBATeam("Spurs");
System.out.print("How many players Spurs own: ");
Scanner input2 = new Scanner (System.in);
int numberOfPlayers2 = input.nextInt();
spurs.get(numberOfPlayers2);

 
for (int i = 0; i < numberOfPlayers2; i++) {
      System.out.print("Enter the name of Player #" + (i + 1) + ": ");
      String playerName1 = input2.next();
      spurs.addAPlayer(playerName1);
}
//construct Team Spurs
 
//Your code here
int heatwin=0;
int spurswin=0;

for (int i=0 ; i<6;i++)
{
	double k=Math.random();
	if (k>=.5)
	{
		heatwin++;
	
		{
			if(heatwin>3)
			break;
			}
	}
	else { 
		spurswin++;
		{if (spurswin>3)
			break;}
	}
}
/*simulate a series of atmost 7 games by generating a random number; 
* if the random number is bigger than 0.5, Heat wins; otherwise Heat losses a game.
*  As soon as team wins 4 games, the series is over. */
 
//Your code here
System.out.println(heat.gets());
System.out.println(spurs.gets());
System.out.println(heatwin);
System.out.println(spurswin);

}
}







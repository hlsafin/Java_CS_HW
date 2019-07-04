import java.util.Arrays;

public class NBATeam {
private String sTeamName;
private int nWin;
private int nLoss;
private  String [] playerArray;
private int mm=0;

//Your code here

 NBATeam (String p)
{
  sTeamName=p;
}
public void get(int ks)
{
	//this.size= ks;
	this.playerArray=new String[ks];
}
 
public void addAPlayer(String k)
{
	this.playerArray[mm]=k;
    this.mm++;
	
}
public  String gets()
{
	//String[] m=playerArray;
	String k=Arrays.toString(playerArray);
	return k;
	
	}
}//end of class definition
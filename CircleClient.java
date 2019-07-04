	import java.util.*;
	import java.math.*;
public class CircleClient {
	
	
		
		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			int xcor=s.nextInt();
			int ycor=s.nextInt();
		    int rad=s.nextInt();
		     Circle kss= new Circle(new Point(xcor,ycor),rad);
		     kss.getRadius();
		     //System.out.print(kss.getCenter().distance(4,2));
		     Point ks= new Point(5,6);
		     System.out.print(kss.contains(ks));
		     

		 
		 
		
		
		
			
		}
	}



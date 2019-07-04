
public class Point {
    private int x;
    private int y;
    
    
     Point(int initialX, int initialY) {
        x = initialX;
        y = initialY;
        
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    public double distance(int xx,int yy)
    {
    	int i=x-xx;
    	int j=y-yy;
    	return Math.sqrt(i*i+j*j);
    	
    }
  
    
    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }
    
    public void setLocation(int newX, int newY) {
        x = newX;
        y = newY;
    }

    public void translate(int dx, int dy) {
        setLocation(x + dx, y + dy);
        
    }
    public String toStringg()
    {
    	return "x"+x+" and y is" +y;
    }


}


public class Circle {
	
	private  Point sample;
	private int radius;
	
	Circle(Point f,int radius)
	{
		sample=f;
		this.radius=radius;
		
	}
	
	public Point getCenter()
	{
		
		return sample;
	}
	public int getRadius()
	{
		return radius;
	}
	
	
	
	
    public double getCircumference()
    {
    	double result= 2*(Math.PI)*radius;
    	return result;
    }
    
    public double getArea()
    {
    	double result=Math.PI*(radius*radius);
    	return result;
    }
    public String toStrin()
    {
    	return "Circle"+sample+"radius"+radius;
    }
    public boolean contains(Point p)
    {
    	System.out.print(sample.distance(p.getX(),p.getY()));
    	//sample.distance(p.getX(),p.getY());
    	
    	if(sample.distance(p.getX(),p.getY()) <=radius)
    		
    	return true;
    	else
    		return false;
    }

}

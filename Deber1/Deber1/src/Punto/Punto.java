package Punto;

public class Punto {

	private double x, y;
	
	public Punto(double x1, double y1)
	{
		x= x1;
		y= y1;
	}
	public Punto()
	{
		x=y=0;
	}

	public double getX()
	{
		return x;
	}
	public void setX(double x)
	{
		this.x = x;
	}
	public double getY()
	{
		return y;
	}
	public void setY(double y)
	{
		this.y = y;
	}

	@Override
	public String toString()
	{
		return "X: " +x +"," + "Y: " +y;
	}
	
	
	
	
	
	
	
	
	
}

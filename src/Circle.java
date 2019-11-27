public class Circle 
{	
	private boolean filled;
	private static double radius;
	public Circle(double r, boolean f)
	{
		radius=r;
		filled=f;
		System.out.print("Der Kreis");
	}
	public Circle(double r) 
	{
		this(r,false);
		System.out.print("Der Kreis");
	}
	//default constructor
	public Circle()
	{
		this(1.0,false);
		System.out.print("Der Kreis");
	}
	public static double getCircumference()
	{
		double umfang=2*SomeMaths.PI*radius;
		return umfang;	
	}
	public static double getArea()
	{
		double flaeche=radius*radius*SomeMaths.PI;
		return flaeche;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public static void setRadius(double radius) 
	{
		if(radius<=1) 
		{
			System.out.println("Der Radius muss positiv sein!");
			return;
		}
		Circle.radius = radius;
	}
	public boolean getFilled() {
		return filled;
	}
	public static double getRadius() {
		return radius;
	}
}

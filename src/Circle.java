public class Circle 
{	
	private boolean filled;
	private static double radius;
	public Circle(double r, boolean f)
	{
		radius=r;
		filled=f;
	}
	public Circle(double r) 
	{
		this(r,false);
	}
	public Circle()
	{
		this(1,false);
	}
	public static double getCircumference()
	{
		double Umfang=2*SomeMaths.PI*radius;
		return Umfang;	
	}
	public static double getArea()
	{
		double Flaeche=radius*radius*SomeMaths.PI;
		return Flaeche;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public static void setRadius(double radius) {
		Circle.radius = radius;
	}
	public boolean getFilled() {
		return filled;
	}
	public static double getRadius() {
		return radius;
	}
}

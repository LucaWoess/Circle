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
	//default constructor
	public Circle()
	{
		this(1.0,false);
	}
	public static double getCircumference()
	{
		double umfang=2*SomeMaths.PI*radius;
		return umfang;	
	}

	public double getCircumference(double radius) {
		return 2 * SomeMaths.PI * radius;
	}
	
	public double getArea(double radius) {
		return SomeMaths.PI * SomeMaths.getSquare(radius);
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
	public void output() {
		System.out.println("Radius: "+getRadius());
		outputAreaOrCircumference(getFilled());
		System.out.println("________________________\n");
		
	}
	private void outputAreaOrCircumference(boolean filled2) {
		if (filled) {
			System.out.println("Flaeche: "+getArea(getRadius())+"\n");
		}
		else {
			System.out.println("Umfang: "+getCircumference(getRadius())+"\n");
		}
		
	}
}

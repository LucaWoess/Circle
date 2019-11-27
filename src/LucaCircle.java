public class LucaCircle extends Circle
{
	private String name;
	public LucaCircle(double d, boolean filled, String vname)
	{
		super(d,filled);
		this.name=vname;
		System.out.print("Der Kreis "+name);
	}
	
	public LucaCircle(double radius, boolean filled)
	{
		super(radius,filled);
		this.name="Luca";
		System.out.print("Der Kreis "+name);
	}
	
	public LucaCircle(double radius, String vname)
	{
		this(radius,false,vname);
		System.out.print("Der Kreis "+name);
	}
	
	public LucaCircle(String vname)
	{
		this(1.0,false,vname);
		System.out.print("Der Kreis "+name);
	}
	
	public String getName() {
		return name;
	}
}

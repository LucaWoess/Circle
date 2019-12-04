public class LucaCircle extends Circle
{
	private String name;
	public LucaCircle(double d, boolean filled, String vname)
	{
		super(d,filled);
		this.name=vname;
	}
	
	public LucaCircle(double radius, boolean filled)
	{
		super(radius,filled);
		this.name="Luca";
	}
	
	public LucaCircle(double radius, String vname)
	{
		this(radius,false,vname);
	}
	
	public LucaCircle(String vname)
	{
		this(1.0,false,vname);
	}
	
	public String getName() {
		return name;
	}
	
	public String outputName(String name) {
		if (name == "") {
			return "Kreis";
		}
		else {
			return this.name;
		}
	}
	
	public void output() {
		String cName = outputName(this.name);
		System.out.println("Name: "+cName);
		super.output();
	}
}

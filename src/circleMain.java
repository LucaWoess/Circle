public class circleMain 
{
	public static void main(String[] args) 
	{
		SomeMaths sm = new SomeMaths();
		LucaCircle c1 = new LucaCircle(5.000,true);
		System.out.println("1. Kreis:\nUmfang: "+c1.getCircumference()+"\nFlaeche: "+c1.getArea());
		if(c1.getFilled())System.out.println("1. Kreis ist gefüllt.\n");
		else System.out.println("1. Kreis ist nicht gefüllt.\n");
		Circle c2 = new Circle(8.00000);
		System.out.println("2. Kreis:\nUmfang: "+c2.getCircumference()+"\nFlaeche: "+c2.getArea());
		if(c2.getFilled())System.out.println("2. Kreis ist gefüllt.\n");
			else System.out.println("2. Kreis ist nicht gefüllt.\n");
		Circle c3 = new Circle(3.00000);
		System.out.println("3. Kreis:\nUmfang: "+c3.getCircumference()+"\nFlaeche: "+c3.getArea());
		if(c3.getFilled())System.out.println("3. Kreis ist gefüllt.\n");
		else System.out.println("3. Kreis ist nicht gefüllt.\n");
		
	}
}

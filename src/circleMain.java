public class circleMain 
{
	public static void main(String[] args) 
	{
		SomeMaths sm = new SomeMaths();
		LucaCircle c1 = new LucaCircle(5.000,true,"Luca");
		if(c1.getFilled())System.out.println(" hat den Umfang "+c1.getCircumference()+" und die Fläche "+c1.getArea());
		else System.out.println(" hat den Umfang "+c1.getCircumference());
		Circle c2 = new Circle(8.00000);
		if(c2.getFilled())System.out.println(" hat den Umfang "+c2.getCircumference()+" und die Fläche "+c2.getArea());
		else System.out.println(" hat den Umfang "+c2.getCircumference());
		Circle c3 = new Circle(3.00000);
		if(c3.getFilled())System.out.println(" hat den Umfang "+c3.getCircumference()+" und die Fläche "+c3.getArea());
		else System.out.println(" hat den Umfang "+c3.getCircumference());
	}
}

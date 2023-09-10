//Assignment 8 (Inheritance)
//Q1)Implement Single Inheritance


class Rectangle extends shape
{
	int area;
	void calculateArea()
	{
		area=length*breadth;
	}
	public static void main(String args[])
	{
		Rectangle r=new Rectangle();
		r.length=10;
		r.breadth=20;
		//calculate area
		r.calculateArea();
		System.out.println("The Area of rectangle of length\""+r.length+"\"and breadth\""+r.breadth+"\"is\""+r.area+"\"");
	
	}
}
class shape
{
	int length;
	int breadth;
}

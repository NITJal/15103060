package abstractMethod;

abstract class Shape
{
	abstract void numberOfSides();
}

class Trapezoid extends Shape
{
	void numberOfSides()
	{
		System.out.println("Number of Sides of Trapezoid = 4");
	}
}

class Triangle extends Shape
{
	void numberOfSides()
	{
		System.out.println("Number of Sides of Triangle = 3");
	}
}

class Hexagon extends Shape
{
	void numberOfSides()
	{
		System.out.println("Number of Sides of Hexagon = 6");
	}
	
}

public class Abstraction
{
	public static void main(String[] args) 
	{
			Trapezoid tra = new Trapezoid();
			tra.numberOfSides();
			Triangle tri = new Triangle();
			tri.numberOfSides();
			Hexagon h = new Hexagon();
			h.numberOfSides();
	}

}

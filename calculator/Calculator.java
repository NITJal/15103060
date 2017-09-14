package calculator;

import java.util.Scanner;

interface functions
{
	int Addition(int a,int b);
	int Subtraction(int a,int b);
	int Multiplication(int a,int b);
	float Division(int a,int b);
	double Square(int a);
	double Sin(int a);
	double Cos(int a);
	int Max(int a,int b);
	int Min(int a,int b);
}

public class Calculator implements functions{
	
	static int a;
	static int b;
	
	Calculator()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		a = sc.nextInt();
		b = sc.nextInt();
	}
	
	public int Addition(int a,int b)
	{
		return a+b;
	}
	
	public int Subtraction(int a,int b)
	{
		return a-b;
	}
	public int Multiplication(int a,int b)
	{
		return a*b;
	}
	public float Division(int a,int b)
	{
		return (float)a/(float)b;
	}
	public double Square(int a)
	{
		return Math.pow(a, 2);
	}
	public double Sin(int a)
	{
		return Math.sin((double)a);
	}
	public double Cos(int a)
	{
		return Math.cos((double)a);
	}
	public int Max(int a,int b)
	{
		if(a>b)
			return a;
		else
			return b;
	}
	public int Min(int a,int b)
	{
		if(a<b)
			return a;
		else
			return b;
	}

	public static void main(String[] args)
	{
		Calculator c = new Calculator();
		Scanner sc = new Scanner(System.in);
		int ch=1;
		while(ch!=10)
		{
			System.out.println("\n\n1.Addition of two numbers\n2.Subtraction of two numbers\n3.Multiplication of two numbers\n4.Division of two numbers\n5.Square\n6.Sin of number\n7.Cos of number\n8.Maximum of two numberz\n9.Minimun of two numbers\n10.Exit\n");
			System.out.println("Enter your choice : ");
			ch = sc.nextInt();
			switch(ch)
			{
				case 1: 	System.out.println(c.Addition(a, b));
							break;
				case 2: 	System.out.println(c.Subtraction(a, b));
							break;
				case 3: 	System.out.println(c.Multiplication(a, b));
							break;
				case 4: 	System.out.println(c.Division(a, b));
							break;
				case 5: 	System.out.println(c.Square(a));
							break;
				case 6: 	System.out.println(c.Sin(a));
							break;
				case 7: 	System.out.println(c.Cos(a));
							break;
				case 8: 	System.out.println(c.Max(a, b));
							break;
				case 9: 	System.out.println(c.Min(a, b));
							break;
				case 10: break;
			}
		}
	}

}

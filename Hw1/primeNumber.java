package primeNumber;

import java.util.Scanner;

public class primeNumber
{
	
	static void prime(int x)
	{
		for(int i=2 ; i<=x/2; i++)
		{
			if(x%i==0)
				return;
		}
		System.out.print(x + " ");
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int x = sc.nextInt();
		for(int j=2 ; j<=x ; j++)
			prime(j);
	}

}

package palindrome;

import java.util.Scanner;

public class Palindrome
{
	Palindrome()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.next();
		char[] arr = str.toCharArray();
		int i,j;
		for(i=0, j=arr.length-1 ; i<j ; i++, j--)
		{
			if(arr[i]!=arr[j])
			{
				System.out.println("String not a Palindrome");
				return;
			}
		}
		System.out.println("String is a Palindrome");
		
	}
	
	public static void main(String[] args) 
	{
		Palindrome pal = new Palindrome();
	}

}

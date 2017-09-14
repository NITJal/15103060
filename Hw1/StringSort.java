package stringSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StringSort 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int i=0;
		ArrayList<String> list = new ArrayList<String>();
		System.out.println("Enter the strings : ");
		String line = sc.nextLine();
		String[] arr = line.split(" ");
		for(String str : arr)
		{
			list.add(str);
		}
		Collections.sort(list);
		System.out.println("Sorted strings : ");
		for(String str : list)
			System.out.print(str + " ");
	}

}

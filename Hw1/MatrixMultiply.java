package matrixMultiply;

import java.util.Scanner;

public class MatrixMultiply 
{
	Scanner sc = new Scanner(System.in);
	static int r1;
	static int c1;
	static int r2;
	static int c2;
	MatrixMultiply()
	{
		System.out.println("Enter the dimnesions of First Matrix (row*column):  ");
		r1 = sc.nextInt();
		c1 = sc.nextInt();
		System.out.println("Enter the dimnesions of Second Matrix (row*column):  ");
		r2 = sc.nextInt();
		c2 = sc.nextInt();
		if(c1 == r2)
			initializeMatrices(r1,c1,r2,c2);
		else
			System.out.println("Invalid Matrix Dimensions");
	}
	
	void initializeMatrices(int r1,int c1,int r2,int c2)
	{
		int[][] mat1 = new int[r1][c1];
		int[][] mat2 = new int[r2][c2];
		int[][] mat3 = new int[r1][c2];
		System.out.println("Enter the values: ");
		for(int i=0 ; i<r1 ; i++)
		{
			for(int j=0 ; j<c1 ; j++)
				mat1[i][j]=sc.nextInt();
		}
		System.out.println("Enter the values: ");
		for(int i=0 ; i<r2 ; i++)
		{
			for(int j=0 ; j<c2 ; j++)
				mat2[i][j]=sc.nextInt();
		}
		System.out.println("First Matrix : ");
		for(int i=0 ; i<mat1.length ; i++)
		{
			for(int j=0 ; j<mat1[0].length ; j++)
				System.out.print(mat1[i][j] + " ");
			System.out.println();
		}
		System.out.println("Second Matrix : ");
		for(int i=0 ; i<mat2.length ; i++)
		{
			for(int j=0 ; j<mat2[0].length ; j++)
				System.out.print(mat2[i][j] + " ");
			System.out.println();
		}
		
		multiply(mat1,mat2,mat3);
	}
	
	void multiply(int mat1[][],int mat2[][],int mat3[][])
	{
		for(int i=0 ; i<mat1.length ; i++)
		{
			for(int j=0; j<mat2[0].length ; j++)
			{
				mat3[i][j]=0;
				for(int k=0; k<mat2.length ; k++)
				{
					mat3[i][j] += mat1[i][k]*mat2[k][j];
				}
			}
		}
		
		for(int i=0 ; i<mat3.length ; i++)
		{
			for(int j=0 ; j<mat3[0].length ; j++)
				System.out.print(mat3[i][j] + " ");
			System.out.println();
		}
	}
	
	
	
	public static void main(String[] args) 
	{
		MatrixMultiply mat = new MatrixMultiply();
	}

}

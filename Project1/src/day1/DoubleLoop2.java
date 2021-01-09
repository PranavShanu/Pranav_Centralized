package day1;

import java.util.Scanner;

public class DoubleLoop2 {
	
	public static void main(String[] args) {
		

		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number");
		int a=s.nextInt();
		int i,j,k=1;
		for(i=1;i<=a;i++)
		
		{		
			for(j=1;j<=i;j++)
			{
				System.out.print(k+" ");
				++k;
				}						
			System.out.println();
			
			}
		
			
		}

	}
	


package day1;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		int b=1;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number");
		int a=s.nextInt();
		
		for (int i=1;i<=a;i++)
		{
			b=b*i;
				
		}
			System.out.print("Factorial of "+a);
			System.out.println(" is "+b);
	}

}

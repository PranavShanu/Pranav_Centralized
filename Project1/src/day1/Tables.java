package day1;

import java.util.Scanner;

public class Tables {
	
	public static void main(String[] args) {
		
		int a,c;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number whose table you want to Print");
				a=s.nextInt();
				System.out.println("Till what you want to print table");
				c=s.nextInt();
		System.out.println("Table of " + a);
		System.out.println();
		for(int i=1;i<=c;i++)
		{
			int b=a*i;
			System.out.println(a+"x"+i+"="+b);
			
		}		
	}

}

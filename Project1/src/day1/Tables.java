package day1;

import java.util.Scanner;

public class Tables {
	
	public static void main(String[] args) {
		
		int a;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number whose table you want to Print");
		
		a=s.nextInt();
		System.out.println("Table of " + a);
		System.out.println();
		for(int i=1;i<=10;i++)
		{
			int b=a*i;
			System.out.println(a+"x"+i+"="+b);
			
		}		
	}

}

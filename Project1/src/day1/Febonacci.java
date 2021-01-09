package day1;

import java.util.Scanner;

public class Febonacci {
	
	public static void main(String[] args) {
		
		int a;
		int b=0;//1st number
		int c=1;//2nd number
		int d;//3rd number
		Scanner s=new Scanner(System.in);
		System.out.println("Enter series length");
		a=s.nextInt();
		
		System.out.print(b+" "+c);
		for (int i=2;i<a;i++)
		{
			d=c+b;
			
			System.out.print(" "+d);
			
			b=c;
			c=d;
			
		}
	}

}

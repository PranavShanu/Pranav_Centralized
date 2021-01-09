package day1;

import java.util.Scanner;

public class Armstrong {
	
	public static void main(String[] args) {
		
		int a,b,c=0,sum=0,orig;
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number");
		a=s.nextInt();
		orig=a;
		while(a!=0)
		{
			b=a%10;
			sum=b*b*b;
			c=c+sum;
			a=a/10;
		}
		
		if(orig==c)
			System.out.println("Armstrong");
		else
			System.out.println("Not Armstrong");
	}

}

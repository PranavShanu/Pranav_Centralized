package day1;

import java.util.Scanner;

public class Class1
{
//	
//	int a;//variable 1
//	int b;//variable 2
//	public void pranav() //method 1
//	{
//		System.out.println("Welcome to Java");
//				
//	}
//	
//	public void music() //method 2
//	{
//		System.out.println("Never Give up !");	
//	}
	
	public static void main(String[] args)
	{
		int a;
		int count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		
		a=s.nextInt();
		
		while(a!=0)
		{
			count++;
			a=a/10;
		}
		
		
			System.out.println("Number is "+count+" Digit");
		
	

}}

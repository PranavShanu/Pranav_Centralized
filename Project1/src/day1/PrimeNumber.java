package day1;

import java.util.*;

public class PrimeNumber
{
	public static void main(String[] args) 
	{
		
		System.out.println("Enter a Variable");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int x=0;
		int b=a/2;		
		
		if(a==0)
			{
			System.out.println(a+" is not prime number"); 
			}
		else if (a==1) 
		      {
			   System.out.println(a+" is not prime number");      
			  }
		else
		{
			for(int i=2;i<=b;i++)
				
			{
				if(a%i==0)
				{
					System.out.println(a+" is Not a Prime Number");
					x=1;
					break;
				}
			}	
			
		if (x==0)
		{
			System.out.println(a+" is a Prime Number");
		}
		}}}		

package day1;

import java.util.Scanner;

public class PalindromeNumber 
{
	
public static void main(String[] args) 
{
	
	int a;
	int r=0;
	int x;
	int c;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Please Enter a Number");
	a=sc.nextInt();
	c=a;
	while(a!=0)
	{
	 x=a%10;	
	 r=(r*10+x);
	 a/=10;
	}
	
	if(c==r)
	
		System.out.println(c+" is a Palindrome");
	
	
	else
	
	System.out.println(c+" is Not a Palindrome");
    
}
}

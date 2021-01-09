package day1;

import java.util.*;

public class ClassA {
	
	public static void main(String[] args) 
	{
		ClassA A=new ClassA();
		Scanner Ob= new Scanner(System.in);	
		System.out.println("Please enter value of a :");
		int a=Ob.nextInt();
		System.out.println("Please enter value of b :");
	    int b=Ob.nextInt();
	    
	    //Logic
	    
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("Updated value of a :");
	    System.out.println(a);
	    System.out.println("Updated value of b :");
	    System.out.println(b);
	    
	}
		
}


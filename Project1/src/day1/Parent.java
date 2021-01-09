package day1;

public class Parent {
	
	public Parent()
	{
	this(1);
	System.out.println("Parent Default");
	}
	
	public Parent(int a)
	{
	this(1,2,3);
	System.out.println("Parent 1 Parameterized");
	}
	
	public Parent(int a,int b)
	{
	this();
	System.out.println("Parent 2 parameterized");
	}
	
	public Parent(int a,int b,int c)
	{
	//this(1,2,3,4);
	System.out.println("Parent 3 Parameterized");
	}
	
	public Parent(int a,int b,int c,int d)
	{
	this();
	System.out.println("Parent 4 Parameterized");
	}
	
	public static void main(String[] args)
	{
		//Parent P=new Parent(1,2);
		}
}

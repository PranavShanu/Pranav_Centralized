package day1;

public class Child extends Parent  {
	
	public Child()
	{
	super(1,2);
	System.out.println("Child Default");
	}
	public Child(int a)
	{
	this(1,2,3,4);
	System.out.println("Child 1 Parameterized");
	}
    public Child(int a,int b)
    {
    this(1,2,3);
    System.out.println("Child 2 Parameterized");
	}
        public Child(int a,int b,int c)
    {
    this();    
    System.out.println("Child 3 Parameterized");
    }
    
    public Child(int a,int b,int c,int d)
    {
    this(1,2);
    System.out.println("Child 4 Parameterized");
    }
    
    public static void main(String[] args) {
    	Child C=new Child(1);
    	
    }
}


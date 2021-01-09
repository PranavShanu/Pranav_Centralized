package day1;

import java.util.Scanner;

public class DoubleLoop1 {
	
	

		public static void main(String[] args) {		
			
			Scanner s=new Scanner(System.in);
			System.out.println("Enter a Number");
			int a=s.nextInt();
			
			for(int i=0;i<=a;i++)
			
			{			
				for(int j=0;j<=i;j++)
				{
					System.out.print("*");				
					
				}
				System.out.println();
			}
			
		}
	}




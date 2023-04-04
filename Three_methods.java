package Functions;

/*Q 1) create a class three methods
a) void cube(int a)
b) void square (int b)
c) void greater(int a,int b,int c)

create another class having main method
display menu
1) cube
2) square
3) greater
Ask choice from user and based on choice call above methods
Repeat the menu till choice is not equal to 0
*/

import java.util.*;

public class Three_methods {

	void cube(int a)
	{
		int r=a*a*a;
		System.out.println("cube = " + r);
		
	}
	
	void square(int b)
	{
		
		int sq=b*b;
		System.out.println("square = "+ sq);
	}
	
	public void greater(int a,int b,int c)
	{
		if(a>b && a<c)
		{
		System.out.println("a is greater");
		}
		
		else if(a>c)
		{
			System.out.println("b is greater");
		}
		else
		{
			System.out.println("c is greater");
		}
		
	}
	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		int choice=0;
		
		do 
		{
			System.out.println("\n Enter your choice = ");
			System.out.println("1. cube");
			System.out.println("1. square");
			System.out.println("1. greater");
			
			choice =s.nextInt();
			Three_methods obj=new Three_methods();
			switch(choice)
			{
			case 1: obj.cube(5);
			break;
			
			case 2: obj.square(10);
			break;
			
			case 3: obj.greater(48, 78, 89);
			break;
			
			}
		}
		while(choice !=0);
			System.out.println("Exit");
		s.close();
			
		
		

	}

}
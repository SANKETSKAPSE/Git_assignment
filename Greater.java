package Functions;

import java.util.*;
//Q 2 create another class having method like
//void greater() --> take 3 input  within function
//void greater(int ,int)
//void greater(int a,int b,int c)
//create main in same class and call all methods


public class Greater {
	
	
	void greater()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int n1 = s.nextInt();
		System.out.println("Enter 2nd number");
		int n2 = s.nextInt();
		System.out.println("Enter 3rd number");
		int n3 = s.nextInt();
		int high;
		high = (n1>n2)? (n1>n3 ? n1 : n3) : (n2 > n3 ? n2 : n3);
		System.out.println(high + "is greater");
		s.close();
		}
	void greater (int x, int y)
	{
		if(x>y)
			System.out.println("x is greater");
		else
			System.out.println("y is greater");
	}
	void greater(int a,int b,int c) {
		if(a>b && a>c) {
			System.out.println("a is greater");
		}
		else if (b>c) {
			System.out.println("b is greater");
		}
		else
		{
			System.out.println("c is greater");
		}

	}
		
	

	public static void main(String[] args) {
		
		Greater g= new Greater();
		g.greater();
		g.greater(25, 23);
		g.greater(12, 45, 65);
		
				
	}

}

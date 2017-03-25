package basics;
import java.util.Scanner;
public class BiggestThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the first number");
		int a=Integer.parseInt(s.nextLine());
		System.out.println("enter the second number");
		int b=Integer.parseInt(s.nextLine());
		System.out.println("enter the third number");
		int c=Integer.parseInt(s.nextLine());
		if(a>b)
		{
			System.out.println("a is big"+a);
		}
		if(b>c)
		{
			System.out.println("b is big"+b);
		}
		else
		if(c>a)
		{
			System.out.println("c is big"+c);
		}
	
		}
	}



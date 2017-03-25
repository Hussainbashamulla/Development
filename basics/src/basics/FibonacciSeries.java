package basics;
import java.util.Scanner;
public class FibonacciSeries {
static	int a=0,b=1,c=1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int d=Integer.parseInt(s.nextLine());
		System.out.println("1  ");
		System.out.println("1  ");
		while(a<=d)
		{
			a=b+c;
			
			System.out.println(a);
			b=c;
			c=a;
		}

	}

}

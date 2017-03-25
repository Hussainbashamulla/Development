package basics;
import java.util.Scanner;

public class Polindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=Integer.parseInt(s.nextLine());
	
		int sum=0,r;
		int temp=n;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			sum=sum*10+r;
		}
		if(temp==sum)
		
			System.out.println("given number is polindrom="+sum);
		else
			System.out.println("given number is not polindrom="+sum);


	}

}

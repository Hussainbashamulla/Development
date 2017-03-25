package basics;
import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number:");
	
		// TODO Auto-generated method stub
		int n=Integer.parseInt(s.nextLine());
		int sum=0,r;
		
		while(n>0)
		{
			r=n%10;
			sum=sum*10+r;
			n=n/10;
			
		}
		System.out.println("given number is reverse="+sum);


	}

}

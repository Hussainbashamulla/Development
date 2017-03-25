package basics;
import java.util.Scanner;
public class PrimeNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int a=Integer.parseInt(s.nextLine());
		
		for( int i=2;i<=a;i++)
		{
			for(int j=2;j<=i;j++)
			{
				if(j==i)
				{
				System.out.println(i);
				}
				
			
			if(i%j==0)
			{
			
				break;
				
			}
		
}
		}
	}

	}



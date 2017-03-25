package basics;
import java.util.*;

public class SumOfDigits {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the numbr");
int n=Integer.parseInt(s.nextLine());
int sum=0;int r=0;
while(n>0)
{
	
r=n%10;

sum=sum+n%10;
	n=n/10;
	
	

}
System.out.println( sum);



	}

}

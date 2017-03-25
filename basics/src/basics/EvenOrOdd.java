package basics;
import java.util.Scanner;
public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
int a=Integer.parseInt(s.nextLine());
if(a%2==0)
{
	System.out.println("a is even");
}
else
{
	System.out.println("a is odd");
}
	}
	

}

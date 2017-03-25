package basics;
import java.util.Scanner;
public class Multiplecation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int a=Integer.parseInt(s.nextLine());
for(int i=a;i<=10;i++)
{
	int b=i*a;

System.out.println(b);
}
	}
}


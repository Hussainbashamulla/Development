package basics;
import java.util.Scanner;
public class Factorial {
	 static int b=1;

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int a=Integer.parseInt(s.nextLine());
		for(int i=1;i<=a;i++){
			b=b+i;
		}
		System.out.println(b);
		// TODO Auto-generated method stub
		

	}

}

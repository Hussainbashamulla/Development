package basics;
import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the any word");
String a=s.nextLine();
String b="";
for(int i=a.length()-1;i>=0;i--)
{
	b+=a.charAt(i);
}
System.out.println(b);
	}

}

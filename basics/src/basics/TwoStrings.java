package basics;
import java.util.*;
public class TwoStrings {
	public static void main(String[] args) {
	int num;
	Random rand=new Random();

	for(int i=1;i<=10;i++)
	{
		//0 to 5
		num=0+rand.nextInt(5);//4 1 1 0 3 4 1 1 2 2 
		//5 to 10
		num=5+rand.nextInt(10);//6 12 7 10 14 7 8 5 11 13 
		System.out.println(num+" ");
	}
	
	
	

} 
}
package basics;
import java.lang.StringBuffer;
public class String {
	public static void main(String[] args) {
		StringBuffer str1="abc";
		String str2="xyz";
		
		for(int i=0;i<str1.length()-1;i++)
		{
			for(int j=0;j<str2.length()-1;j++)
			{
				System.out.println(i+j);
			}
		}
	}
}
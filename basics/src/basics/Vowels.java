package basics;

public class Vowels 
{
	public static void main(String[] args) 
	{
		int count =0;
		String s="ballaiah";
		for(int i=0; i<s.length();i++)
		{
			if((s.charAt(i)=='a')||(s.charAt(i)=='e')||	(s.charAt(i)=='i')||(s.charAt(i)=='o')||(s.charAt(i)=='u'))
		{
				
		
				System.out.println("vowels is:"+       s.charAt(i));
				count ++;
				System.out.println(count);
				}
			
			
		}
	}
}
	

	

package basics;

public class Diamond1 {
	public static void main(String[] args) {
		for(int i=1;i<=4;i++)
		{
			for(int k=3;k>=i;k--)
			{
				System.out.println("");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.println(j+" ");
			}
			System.out.println(" ");
		}
	}

}

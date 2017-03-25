package basics;

public class CommonElementsBetweenTwoArrays {
	 static int j;

	public static void main(String[] args) {
		int [] a={4,0,2,1,6};
		int [] b={4,5,9,7,2,1,0};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
			if(a[i]==b[j])
			{
				System.out.println(b[j]);
			}
		}
		// TODO Auto-generated method stub

	}

}
}

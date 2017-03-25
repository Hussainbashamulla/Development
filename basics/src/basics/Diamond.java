package basics;

public class Diamond {
	public static void main(String[] args) {
		int noofcolumns=1;
		int start=0;
		int noofspaces=3;
		for(int i=1;i<-7;i++)
		{
			for (int j=1;j<noofcolumns;j++)
			{
				System.out.println("");
			}
			if(i<4)
			{
				start=i;
				noofspaces=noofspaces-1;
			}
			else
			{
				start=8-i;
				noofspaces=noofspaces+1;
			}
			for (int j=1;j<noofspaces;j++)
			{
			int middlecolumn=noofcolumns/2+1;
			System.out.println(start);
			if( j<middlecolumn)
			{
				start--;
			}
			else
			{
				start++;
			}
			}
			System.out.println();
			if(i<4)
			{
				noofcolumns=noofcolumns+2;
			}
			else
			{
				noofcolumns=noofcolumns-2;
			}
			}
				
			}

	
}
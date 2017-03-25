package basics;
import java.util.*;

public class TreeSetDemo {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
	TreeSet t =new TreeSet(new MyComparator());
	t.add(new StringBuffer("a"));
	t.add(new StringBuffer("z"));
	t.add(new StringBuffer("x"));
	System.out.println(t);

		}

	}
class MyComparator implements Comparator
	{
		public int compare(Object obj1,Object obj2)
		{
			String i1=obj1.toString();
			String i2=obj2.toString();
			return i2.compareTo(i1);
				}
		}


	


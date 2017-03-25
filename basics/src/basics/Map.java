package basics;
import java.util.*;
public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap t=new TreeMap(new MyComparator());
		t.put("raj", 20);
		t.put("amazon", 10);
		t.put("baj", 60);
	}

}
class MyComparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		String s1=obj1.toString();
		String s2=obj2.toString();
		return s2.compareTo(s1);
		
	}
	
}

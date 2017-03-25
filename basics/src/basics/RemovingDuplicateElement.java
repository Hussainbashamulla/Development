package basics;
import java.util.*;
public class RemovingDuplicateElement {
	public static void main(String[] args) {
	String a="alpha";
	List<String>list=Arrays.asList(a.split(""));
	Set<String>set=new HashSet<String>(list);
	for(String word=set)
	{
		System.out.println(word+"="+Collections.frequency(list,word));
	}
	
	}
}
package basics;
import java.util.*;
public class Remove {
	public static void main(String[] args) 
	{
		int count=0;
		int [] arr = {5, 3, 4, 6, 7, 5, 3, 2, 1};
		int length = arr.length;

		for(int i = 0; i < length-1;i++){
		for(int j = i +1; j < length; j++){
		if((arr[i] == (arr[j])) && (i != j)){
		System.out.println("Duplicate elements="+arr[i]);
		count ++;
		}
		}
		}
		System.out.println("total duplicate values="+count);
		}
		}
	
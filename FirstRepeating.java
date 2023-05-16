package topcrowd;
import java.util.*;
public class FirstRepeating {

	static void printFirstRepeatingArray(int[] arr) {
		
	int min = -1;
	HashSet<Integer> set = new HashSet<>();
	for(int i=arr.length-1; i>0; i--) 
	{
		if(set.contains(arr[i]))
				min=i;
		else
			set.add(arr[i]);
	}
	
	if(min!= -1)
		System.out.println("First Repeating Element is "+arr[min]);
	else
		System.out.println("There are no repeating elements in the array");
	}

	public static void main(String[] args)
	{
		int arr[] = {1,5,3,4,3,5,6};
		int arr1[] = {1,2,3,4};		
		System.out.println("First Example: " +Arrays.toString(arr));
		printFirstRepeatingArray(arr);
		System.out.println("Second example   :"+Arrays.toString(arr1));
		printFirstRepeatingArray(arr1);
		
		
		

	}

 }

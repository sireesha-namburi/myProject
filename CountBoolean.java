package topcrowd;

import java.util.*;

public class CountBoolean {

	private static boolean countBoolean(boolean first, boolean second, boolean third) {
		boolean result;
		if (first) { // if first is true check any one of second and third is true
			result = second || third;
		} else {

			// if first is false both the second and third should be true
			result = second && third;
		}

		return result;
	}

	public static void main(String[] args) {
	    
	    // create 3 boolean variables
	    boolean first;
	    boolean second;
	    boolean third;
	    boolean result;

	    // get boolean input from the user
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter first boolean value: ");
	    first = sc.nextBoolean();

	    System.out.print("Enter second boolean value: ");
	    second = sc.nextBoolean();

	    System.out.print("Enter third boolean value: ");
	    third = sc.nextBoolean();
        result=countBoolean(first,second,third);
        System.out.println(result);
        sc.close();
	  
	}
}

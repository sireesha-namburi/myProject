package topcrowd;

import java.util.*;

public class SquareOrCube {

	private static int calculate(int num)
	{
		int result =0;
		 if(num<=0) result=-1;
		 else if(num %2 ==0) result= num*num;
		 else result=num*num*num;
		
		return result;

	}

	public static void main(String args[])
	{
		int num;
        int result;
        System.out.print("Enter any number:");
		Scanner sc = new Scanner(System.in);
		num= sc.nextInt();
		result=calculate(num);
		System.out.println(result);
		sc.close();
	}
}



package Day2;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		
		int num;
		
		System.out.println("enter the integer number");
		Scanner input=new Scanner(System.in);
		num=input.nextInt();
		
		if (num % 2 == 0)
			System.out.println("enter a number is even");
		 else
			 System.out.println("enter a number is odd");
			
		

	}
	

}

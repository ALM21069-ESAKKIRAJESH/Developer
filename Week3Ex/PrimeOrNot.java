package Week3Ex;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
		System.out.println("Enter a number to check if it prime or not");
		Scanner s=new Scanner(System.in);
		int i=s.nextInt();
		s.close();
		if(i%2==0) {
			System.out.println(i+"is a prime number");
			
		}
		else {
			System.out.println(i+"is  Not a prime Number");
	}
}
}
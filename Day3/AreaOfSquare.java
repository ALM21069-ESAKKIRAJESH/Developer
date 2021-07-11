package Day3;

import java.util.Scanner;

public class AreaOfSquare {

	public static void main(String[] args) {
		
		System.out.println("enter side of squad:");
		Scanner scanner=new Scanner(System.in);
		double side=scanner.nextDouble();
		double area=side*side;
		System.out.println("area of square is:"+area);

	}

}

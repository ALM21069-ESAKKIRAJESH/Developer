package Day3;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the radius: ");
		
		
		double radius=scanner.nextDouble();
		double area=Math.PI*(radius*radius);
		System.out.println("the area of circlr is: "+area);
		double circumference=Math.PI*2*radius;
		System.out.println("the circumference of the circle is:"+circumference);
		

	}

}

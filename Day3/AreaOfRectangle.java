package Day3;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the length of Rectangle:");
		double length= scanner.nextDouble();
        System.out.println("enter the width of the rectangle:");
        double width=scanner.nextDouble();
        
        double area=length*width;
        System.out.println("area of rectangle is:"+area);
        

	}

}

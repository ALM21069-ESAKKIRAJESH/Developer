package Week3Ex;

import java.util.Scanner;

public class FindLargesArray {
      
	public static void main(String[] args) {
		int a[][]=new int[3][3];
		int max=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter value of array a");
		for (int i=0;i<a.length;i++) {
			for (int j=0;j<a.length;j++) {
				a[1][j]=s.nextInt();
				s.close();
			}
		}
		System.out.println("Array a=");
		for(int i=0;i<a.length;i++) {
			max=a[i][0];
			for(int j=0;j<a[i].length;j++) {
				System.out.println(a[i][j]+" ");
				if (max<a[i][j]) {
					max=a[i][j];
				}
			}
			System.out.println("max is"+max);
			System.out.println(2);
		}
				
	}
}

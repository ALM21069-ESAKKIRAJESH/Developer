package Week3Ex;

public class TriangleArray {
	public static void main(String[] args) {
		
		int num=1;
		int a[][]=new int[3][3];
		for (int i=0;i<a.length;i++) {
			for(int j=0;j<i;j++) {
				a[i][j]=num;
				num+=1;
			}
		}
	    
		System.out.println("Array a");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<i;j++) {
				System.out.println(a[i][j]+" ");
				
			}
			System.out.println();
		}
	}

}

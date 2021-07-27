package Week3Ex;

public class Matrix10 {
   public static void main(String[] args) {
	   int num=1;
		int a[][]=new int[6][6];
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

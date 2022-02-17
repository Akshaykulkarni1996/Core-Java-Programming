package Array_Programes;

import java.util.Scanner;

public class Addition_of_Matrix {

	public static void main(String[] args) {
		int b[][],a[][],c[][],r1,r2,c1,c2,i,j;
		Scanner sc =new Scanner(System.in);
System.out.println("Enter rows and column of first matrix");
r1=sc.nextInt();
c1=sc.nextInt();
System.out.println("Enter rows and column of second matrix");
r2=sc.nextInt();
c2=sc.nextInt();
if(r1==r2 && c1==c2) {
	a=new int[r1][c1];
	b=new int[r2][c2];
	c=new int[r1][c1];

	System.out.println("Enter the element of first matrix "+r1+ " x "+c1);
	for(i=0;i<r1;i++) {
		for(j=0;j<c1;j++) {
			a[i][j]=sc.nextInt();
		}
	}
	System.out.println("Enter the element of second matrix "+r2+" x "+c2);
	for( i=0;i<r2;i++) {
		for( j=0;j<c2;j++) {
			b[i][j]=sc.nextInt();
		}
	}
	
	for(i=0;i<r2;i++) {
		for(j=0;j<c2;j++) {
	c[i][j]=a[i][j]+b[i][j];
	
	}
	}
	System.out.println("Addition of two matrices");
	for(i=0;i<r2;i++) {
		for(j=0;j<c2;j++) {
			System.out.print(c[i][j]+" ");
		}
		System.out.println( );
		}
}
else {
	System.out.println("matrix addition is not possible");
}
	}
}


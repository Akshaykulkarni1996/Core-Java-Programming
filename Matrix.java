package Array_Programes;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		int m,n,r,c;
		int[][] b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of row");
		m=sc.nextInt();
		System.out.println("Enter the number columns");
		n=sc.nextInt();
		b=new int[m][n];
		System.out.println("Enter "+m+" X "+n+" matrix ");
		for(r=0;r<m;r++) {
			for(c=0;c<n;c++) {
				b[r][c]=sc.nextInt();
			
			}
		}
		System.out.println("Entered matrix is");
		for(r=0;r<m;r++) {
			for(c=0;c<n;c++) {
				System.out.print(b[r][c]+" ");
			}
			System.out.println( );
		}

	}

}

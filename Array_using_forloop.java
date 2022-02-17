package Array_Programes;

import java.util.Scanner;

public class Array_using_forloop {

	public static void main(String[] args) {
		int a[] =new int[5];
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array elements "+a.length);
		
		for(i=0;i<=a.length-1;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Array Elements are ");
		for(i=0;i<=a.length-1;i++) 
		{
			System.out.println(a[i]);
		}
	}


}

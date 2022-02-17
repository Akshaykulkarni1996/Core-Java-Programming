package Array_Programes;

import java.util.Scanner;

public class Sum_and_average_of_Array_Number {

	public static void main(String[] args) {
		int a[] =new int[10];
		int i,sum=0;
		float average;
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter "+a.length+" Array Elements");
		
		for(i=0;i<=a.length-1;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Array Elements are ");
		for(i=0;i<=a.length-1;i++) 
		{
			System.out.println(a[i]);}
		System.out.println("Sum Array Elements are ");
		for(i=0;i<=a.length-1;i++) 
		{
			sum=sum+a[i];}
			System.out.println(" sum of array elements are " +sum);
		
		System.out.println("Average of Array Elements are ");
		for(i=0;i<=a.length-1;i++) 
		{
			average=(float)sum/a.length;
			System.out.println("average is " +average);

			}
		

	}
		
}



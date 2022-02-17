package Array_Programes;

import java.util.Scanner;

public class Minimum_Number_using_array {

	public static void main(String[] args) {
		int a[]=new int[5];
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter "+a.length+" elements");
		for(i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
int min=a[0];
for(i=0;i<a.length;i++) {
	if(a[i]<min) {
		min=a[i];
		
	}
}
	System.out.println("Least number is "+min);
	int max=a[0];
	for(i=0;i<a.length;i++) {
		if(a[i]>max) {
			max=a[i];
		}
	}
	System.out.println("Max number is "+max);
}
	
}

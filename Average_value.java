package basic_programs;

import java.util.Scanner;

public class Average_value {

	public static void main(String[] args) {
		float s1,s2,s3,s4,s5,avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First Value");
		s1=sc.nextFloat();
		System.out.println("Enter the Second Value");
		s2=sc.nextFloat();
		System.out.println("Enter the Third Value");
		s3=sc.nextFloat();
		System.out.println("Enter the Fourth Value");
		s4=sc.nextFloat();
		System.out.println("Enter the Fifth Value");
		s5=sc.nextFloat();
		avg=(s1+s2+s3+s4+s5)/5;
		System.out.println("Average Value is " +avg);
	}

}

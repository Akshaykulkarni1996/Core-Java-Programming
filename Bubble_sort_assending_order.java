package Array_Programes;

import java.util.Scanner;

public class Bubble_sort_assending_order {

	public static void main(String[] args) {
		int j,temp,i,size;
		
		Scanner sc=new Scanner(System.in);
System.out.println("enter the size of array");
          size=sc.nextInt();
          int a[]=new int[size];
          System.out.println("enter the array elements");
          for(i=0;i<size;i++)
          {
        	 a[i]=sc.nextInt();
              
          }
          
          for(i=0;i<size;i++)
          {
        	  for(j=0;j<size-1;j++) {
        		  if(a[j]>a[j+1]) {
        			  temp=a[j];
        			  a[j]=a[j+1];
        			  a[j+1]=temp;
        			  
        		  }  
        		
        	  }
          }
          System.out.println("sorted elements are");
          for(i=0;i<a.length;i++) {
        	  System.out.println(a[i]);
          }
         
	}

}
;
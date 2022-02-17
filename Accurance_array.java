package Array_Programes;

import java.util.Scanner;

public class Accurance_array {

	public static void main(String[] args) {
		int size,i,count=0,search_element;
		Scanner sc=new Scanner(System.in);
System.out.println("Enter size");
size=sc.nextInt();
int a[]=new int[size];
System.out.println("enter "+size+ " elements");
for(i=0;i<size;i++)
{
	a[i]=sc.nextInt();
	}
System.out.println("enter the element to be searched");
search_element=sc.nextInt();
for(i=0;i<size;i++)
{
	if(search_element==a[i]) {
		count=count+1;
		break;
	}
}
if(count!=0)
{
	System.out.println("Sucessful search");
	System.out.println("the element "+search_element+" repeated "+count+" times");
}
else
{
	System.out.println("Element Not Found");
	}
	

}}




import java.util.*;
class Read
{
public static void main(String[]args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter the length of array");
int n=s.nextInt();
int arr[]=new int[n];
System.out.println("Enter the numbers");
for(int i=0;i<arr.length;i++)
{
arr[i]=s.nextInt();
}
for(int a:arr)
{
System.out.println("The elements of array is:" + " " + a);
}}}

output
===========================
enter the length of array
5
Enter the numbers
5
6
6
7
8
The elements of array is: 5
The elements of array is: 6
The elements of array is: 6
The elements of array is: 7
The elements of array is: 8
==============================
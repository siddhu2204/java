import java.util.*;
class LinearSearch
{
public static void main(String[]args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the length of array");
int n=s.nextInt();
int arr[]=new int[n];
System.out.println("Enter the elements in the array");
for(int i=0;i<n;i++)
{
arr[i]=s.nextInt();
}
int key;
int location;
System.out.println("Enter the element to be searched");
key=s.nextInt();
for(int i=0;i<n;i++)
{
if(arr[i]==key)
{
location=i;
System.out.println("the index value is:" + location);
break;
}
}
}}

output
=================================
Enter the length of array
10
Enter the elements in the array
1
2
3
4
5
6
7
8
9
10
Enter the element to be searched
6
the index value is:5
=====================================
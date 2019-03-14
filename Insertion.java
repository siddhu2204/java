import java.util.*;
class Insertion
{
public static void main(String[]args)
{
int position,x;
Scanner s=new Scanner(System.in);
System.out.println("Enter the length of array");
int n=s.nextInt();
int arr[]=new int[n+1];
System.out.println("enter the elements in array");
for(int i=0;i<n;i++)
{
arr[i]=s.nextInt();
}
System.out.println("Enter the position");
position=s.nextInt();
System.out.println("Enter the elements in the position");
x=s.nextInt();
for(int i=(n-1);i>=(position-1);i--)
{
arr[i+1]=arr[i];
}
arr[position-1]=x;
System.out.println("Arrays after insertion of new elements");
for(int i=0;i<=n;i++)
{
System.out.println(arr[i]);
}}}

output
===============================
Enter the length of array
5
enter the elements in array
9
8
6
5
4
Enter the position
3
Enter the elements in the position
7
Arrays after insertion of new elements
9
8
7
6
5
4
====================================================
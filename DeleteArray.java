import java.util.*;
class DeleteArray
{
public static void main(String[]args)
{
int x,flag=0,location=0;
Scanner s=new Scanner(System.in);
System.out.println("enter the length of  array");
int n=s.nextInt();
int arr[]=new int[n];
System.out.println("Enter the elements of the array");
for(int i=0;i<n;i++)
{
arr[i]=s.nextInt();
}
System.out.println("Enter the element to delete");
x=s.nextInt();
for(int i=0;i<n;i++)
{
if(arr[i]==x)
{
flag=1;
location=i;
break;
}
else
{
flag=0;
}
}
if(flag==1)
{
for(int i=location+1;i<n;i++)
{
arr[i-1]=arr[i];
}
System.out.println("Elements after deleting");
for(int i=0;i<=n-2;i++)
{
System.out.println(arr[i]);
}
} 
}}

output
==================================
enter the length of  array
10
Enter the elements of the array
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
Enter the element to delete
5
Elements after deleting
1
2
3
4
6
7
8
9
10
=========================================


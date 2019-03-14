import java.util.*;
class DuplicateRemove
{
public static void main(String[]args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the length of array");
int n=s.nextInt();
int arr[]=new int[55];
System.out.println("Enter the elements in the array");
for(int i=0;i<n;i++)
{
arr[i]=s.nextInt();
}
for(int i=0;i<n;i++)
{
System.out.println("Elements in the array are:"+ arr[i]);
}
System.out.println("Elements after removing duplicate numbers");
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;)
{
if(arr[i]==arr[j])
{
for(int x=j;x<n;x++)
{
arr[x]=arr[x+1];
}
n--;
}
else
{
j++;
}
}
}

for(int i=0;i<n;i++)
{
System.out.println(arr[i]);
}
}}


output
========================================
Enter the length of array
10
Enter the elements in the array
1
2
3
4
5
2
3
4
5
1
Elements in the array are:1
Elements in the array are:2
Elements in the array are:3
Elements in the array are:4
Elements in the array are:5
Elements in the array are:2
Elements in the array are:3
Elements in the array are:4
Elements in the array are:5
Elements in the array are:1
Elements after removing duplicate numbers
1
2
3
4
5
===============================================

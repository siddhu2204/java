import java.util.*;
class BinarySearch
{
public static void main(String[]args)
{
int key;
int n;
Scanner s=new Scanner(System.in);
System.out.println("Enter the length of array");
 n=s.nextInt();
int arr[]=new int[n];
System.out.println("Enter the elements in the array");
for(int i=0;i<n;i++)
{
arr[i]=s.nextInt();
}
System.out.println("Enter the element to be searched");
key=s.nextInt();
int low=0;
int high=n-1;
int mid=0;
while(low<=high)
{
mid=(low+high)/2;
if(arr[mid]==key)
{
System.out.println("the index value is:" + mid);
break;
}
else if(arr[mid]>key)
{ 
high=mid-1;
}
else if(arr[mid]<key)
{
low=mid+1;
}
}
if(low>high)
{
System.out.println("elements not found");
}
}}

/*output
=============================
Enter the length of array
10
Enter the elements in the array
11
12
13
14
15
16
17
18
19
20
Enter the element to be searched
11
the index value is:0
=============================*/
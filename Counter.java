import java.util.*;
class Counter
{
public static void main(String[]args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter the length of array");
int n=s.nextInt();
int arr[]=new int[n];
int times[]=new int[n];
int arr1[]=new int[n];
for(int i=0;i<arr.length;i++)
{
System.out.println("Enter the numbers");
 arr[i]=s.nextInt();
times[i]=1;
}
for (int j = 0; j < arr.length; j++)
 {
for (int i = j; i < arr.length; i++)
 {
if (arr[j] == arr[i] && j != i)
 {
arr1[i] = arr[i];
times[i]++;
}}}
for (int i = 0; i<arr1.length; i++)
 {
System.out.println(times[i]);
}}}

output
=====================================
enter the length of array
5
Enter the numbers
66
Enter the numbers
558
Enter the numbers
66
Enter the numbers
11
Enter the numbers
55
1
1
2
1
1
========================================
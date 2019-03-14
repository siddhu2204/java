import java.util.*;
class Repeat
{
public static void main(String[]args)
{
int count=0;
Scanner s=new Scanner(System.in);
System.out.println("enter the length of  array");
int n=s.nextInt();
int arr[]=new int[n];
System.out.println("Enter the elements of the array");
for(int i=0;i<n;i++)
{
arr[i]=s.nextInt();
}
System.out.println("Enter the number you want to count ");
int x=s.nextInt();
for(int i=0;i<n;i++)
{
if(arr[i]==x)
{
count++;
}
}
System.out.println(count);
}
}

output
=========================================
enter the length of  array
5
Enter the elements of the array
12
13
14
12
12
Enter the number you want to count
12
3
===========================================
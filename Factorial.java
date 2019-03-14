import java.util.*;
class Factorial
{
public static void main(String[]args)
{
int factorial=1;
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
int n=s.nextInt();
for(int i=1;i<=n;i++)
{
factorial*=i;
}
System.out.println("the factorial of given number is:" + factorial);
}}

output
==========================
Enter the number
5
the factorial of given number is:120
============================
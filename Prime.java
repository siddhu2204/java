import java.util.*;
class Prime
{
public static void main(String[]args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the range");
int num=s.nextInt();
System.out.println("The prime numbers are");
for(int i=2;i<=num;i++)
{
boolean isPrime=true;
for(int j=2;j<=i-1;j++)
{
if(i%j==0)
{
isPrime=false;
break;
}}
if(isPrime)
{
System.out.println(i);
}
}}}

output
======================
Enter the range
25
The prime numbers are
2
3
5
7
11
13
17
19
23
=======================

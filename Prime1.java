import java.util.*;
class Prime1
{
public static void main(String[]args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");	
int num=s.nextInt();
boolean isPrime=true;
for(int i=2;i<num;i++)
{
if(num%i==0)
{
isPrime=false;
break;
}
}
if(isPrime)
{
System.out.println("the given number is prime");
}
else
{
System.out.println("not prime");
}
}}

output
======================

Enter the number
233
the given number is prime
===========================
Enter the number
231
not prime
===========================


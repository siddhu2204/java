import java.util.*;
class Palindrome
{
public static void main(String[]args)
{
int result=0;
int num2,num3;
Scanner s=new Scanner(System.in);
System.out.println("Enter any number");
int num1=s.nextInt();
num3=num1;
while(num3>0)
{
 num2=num3%10;
 result=result*10+num2;
num3/=10;
}
System.out.println(result);
if(num1==result)
{
System.out.println("the given number is palindrome");
}
else
{
System.out.println("the given number is not a palindrome");
}
}}

output
===================

Enter any number
988
889
the given number is not a palindrome
======================
Enter any number
343
343
the given number is palindrome
=======================
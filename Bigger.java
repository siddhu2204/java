import java.util.*;
class Bigger
{
public static void main(String[]args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter the first number");
int a=s.nextInt();
System.out.println("enter the second number");
int b=s.nextInt();
System.out.println("enter the third number");
int c=s.nextInt();
if(a>b&&a>c)
{
System.out.println("bigger number:"+ a);
}
else if(b>c&&b>a)
{
System.out.println("bigger number:" + b);
}
else
{
System.out.println("bigger number:" + c);
}
if(a<b&&a<c)
{
System.out.println("smaller number:"+ a);
}
else if(b<c&&b<a)
{
System.out.println("smaller number:"+ b);
}
else
 {
System.out.println("smaller number:"+ c);
}
}}


output
==========================================
enter the first number
65
enter the second number
56
enter the third number
09
bigger number:65
smaller number:9
===========================================
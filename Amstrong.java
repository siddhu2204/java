import java.util.*;
import java.math.*;
class Amstrong
{
public static void main(String[]args)
{
int num,num1,num2,num3,num4;
int result,result1,result2,result3;
Scanner s=new Scanner(System.in);
System.out.println("Enter any number");
num=s.nextInt();
int num5=num;
num1=num5%10;
num2=num5/10;
num3=num2/10;
num4=num2%10;
result=(int)Math.pow(num1,3);
result1=(int)Math.pow(num3,3);
result2=(int)Math.pow(num4,3); 
result3=result+result1+result2;
System.out.println(result3);
if(result3==num)

{
System.out.println("the given is  amstrong number");
}
else
{
System.out.println("is not a amstrong number"); 
}

}}

output
===============================
Enter any number
371
371
the given is  amstrong number
================================

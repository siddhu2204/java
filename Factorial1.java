import java.util.*;
class Factorial1
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
System.out.println("the factorial of given number is:"+ i +" " + factorial);
}}}

output
============================
Enter the number
10
the factorial of given number is:1 1
the factorial of given number is:2 2
the factorial of given number is:3 6
the factorial of given number is:4 24
the factorial of given number is:5 120
the factorial of given number is:6 720
the factorial of given number is:7 5040
the factorial of given number is:8 40320
the factorial of given number is:9 362880
the factorial of given number is:10 3628800
====================================

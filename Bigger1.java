import java.util.*;
class Bigger1
{
public static void main(String[] args) {
    int small = 0;
    int large = 0;
    int num;
    System.out.println("enter the length");
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
System.out.println("Enter the numbers");
    num = s.nextInt();
small=num;
for(int i=2;i<n;i++)
{
num=s.nextInt();
if(num>large)
{
large=num;
}
if(num<small){
small=num;
}}
System.out.println("the largest=" + large);
System.out.println("the smallest=" + small);
}}

output
=======================
enter the length
5
Enter the numbers
66
55
56
554
the largest=554
the smallest=55
======================
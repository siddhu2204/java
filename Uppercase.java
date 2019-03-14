import java.util.*;
class Uppercase
{
public static void main(String[]args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter a String");
String a=s.next();
System.out.println(a.substring(0,1).toUpperCase()+a.substring(1));
}}

output
==========================
Enter a String
siddhu
Siddhu
==========================
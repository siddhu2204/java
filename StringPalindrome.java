class StringPalindrome
{
public static void main(String[]args)
{
String a="siddhu";
StringBuilder s=new StringBuilder();
s.append(a);
System.out.println(s);
s=s.reverse();
String b=s.toString();
if(b.equals(a))
{
System.out.println("given strings are palindrome");
}
else
{
System.out.println("not palindrome");
}	
}}

output
=========================
madam
given strings are palindrome
==========================



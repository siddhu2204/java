class Convert
{
public static void main(String[]args)
{
int count=0;
String a="HelloWorld";
char[]c=a.toCharArray();
System.out.println("the duplicate characters are");
for(int i=0;i<a.length();i++)
{
for(int j=i+1;j<a.length();j++)
{
if(c[i]==c[j])
{
System.out.println(c[j]);
count++;
break;
}}}}}

output
=======================
the duplicate characters are
l
l
o
=========================
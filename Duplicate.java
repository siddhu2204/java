class Duplicate
{
public static void main(String[]args)
{
int count=0;
int[] a=new int[]{26,24,28,26,56,44,120,56,27,22,5,9,25,13,22,3,120,9,5};
System.out.println("the duplicate numbers are");
for(int i=0;i<a.length;i++)
{
for(int j=i+1;j<a.length;j++)
{
if(a[i]==a[j])
{
System.out.println(a[j]);
count++;
break;
}}}}}

output
==================================
the duplicate numbers are
26
56
120
22
5
9
===================================
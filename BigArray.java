
class BigArray
{
public static void main(String[]args)
{
int arr[]=new int[] {23,46,57,49,555,47,25,1000,654,21};
int small=arr[0];
int bigger=arr[0];
for(int i=0;i<arr.length;i++)
{
if(arr[i]>bigger)
{
bigger=arr[i];
}
if(arr[i]<small)
{
small=arr[i];
}}
System.out.println("the biggest number is:" + bigger);
System.out.println("the small number is:" + small);
}}

outout
===========================
the biggest number is:1000
the small number is:21
===========================
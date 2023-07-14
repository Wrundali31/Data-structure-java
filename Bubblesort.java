class Bubblesort
{
public static void bsort(int arr[])
{
int n=arr.length;
int temp=0;
for(int i=0;i<n;i++)
{
for(int j=1;j<(n-i);j++)
{
if(arr[j-1]>arr[j])
{
temp=arr[j-1];
arr[j-1]=arr[j];
arr[j]=temp;
}}
}
}


public static void main(String args[])
{
int arr[]={30,20,10};
for(int i:arr)
{
System.out.print(i+" ");
}
bsort(arr);
for(int i:arr)
{
System.out.print(i+" ");
}
}
}
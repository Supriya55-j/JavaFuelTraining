class TwoArray
{
public static void main(String args[])
{int i;
int arr[]={13,-4,82,17};
int twice[]=new int[arr.length];
System.out.println("original array " +arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]);
System.out.print("new array");



for(  i=0;i<arr.length;i++)

{
twice[i]=arr[i];




System.out.print(twice[i]*2+" ");

}
}
}

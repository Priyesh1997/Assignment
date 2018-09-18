import java.util.*;
class rever {
  public int[] rev(int arr[],int f,int l)
  {
    int i,temp;
    if(f<l)
    {
      temp=arr[f];
      arr[f]=arr[l];
      arr[l]=temp;
      rev(arr,f+1,l-1);
    }
return arr;
  }
  public int[] reverse(int arr[]){
    return rev(arr,0,arr.length-1);
  }
  public static void main(String[] args) {
    rever m=new rever();
    int n,i,num;
    Scanner o=new Scanner(System.in);
    System.out.println("enter array size");
    n=o.nextInt();
    int arr[]=new int[n];
    System.out.println("enter array elements");
    for(i=0;i<n;i++)
    {
      arr[i]=o.nextInt();
    }
    int b[]=new int[arr.length];
    b=m.reverse(arr);
    System.out.println("reverse array elements");
    for(i=0;i<arr.length;i++)
    {System.out.println(b[i]);}
  }
}
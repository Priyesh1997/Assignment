import java.util.*;
class countNumberOfWords{
public static void main(String args[]){
 Scanner sc=new Scanner(System.in);

 System.out.println("Enter a sentence .");
 String str=sc.nextLine();

 char c[]=str.toCharArray();
 int count=0,n=c.length;
 for(int i=0;i<n;i++){
   if (c[i]==' ')
   count++;
 }
System.out.println("Number of words = "+(count+1));
  }
}

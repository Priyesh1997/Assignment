import java.util.*;
class reverseString{
public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
String x,rev="";
x=sc.nextLine();
int l=x.length();
for(int i=l-1;i>=0;i--){
  rev+=x.charAt(i);
   }
System.out.println(rev);
   }
}

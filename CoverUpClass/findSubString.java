import java.util.*;
class findSubString{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string");
String str=sc.nextLine();

System.out.println("Enter a sub string");
String str1=sc.nextLine();
if(str.contains(str1)==true)
System.out.println("Sub string is present");
else
System.out.println("Sub string not found");
  }
}

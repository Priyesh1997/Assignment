import java.util.Scanner;

class replaceAllVowels{
public static void main(String args[]){
  Scanner sc=new Scanner(System.in);

  System.out.println("Enter a string");
String str1=sc.nextLine(),str2;
str2=str1.replaceAll("[aeiouAEIOU]", "");

System.out.println("String after removing vowels is :-");
System.out.println(str2);

  }
}

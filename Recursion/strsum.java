import java.util.*;
class strsum {
  public int sumi(String num)
  {
    int i,sum=0;
    if(num.length()==0)
    {return 0;}
    String s="";
    for(i=1;i<num.length();i++)
    {
      s=s+num.charAt(i);
    }
    int p=sumi(s);
    if(p!=0)
    {
      sum=-48+p+(int)num.charAt(0);
      return sum;
    }
    else
    {
      return (int)num.charAt(0)-48;
    }
    
  }  
  public static void main(String[] args) {
    strsum m=new strsum();
    int n,i;
    String num;
    Scanner o=new Scanner(System.in);
    System.out.println("enter the string");
    num=o.nextLine();
    int a=m.sumi(num);
    System.out.println("sum is: "+a);
    
  }
}
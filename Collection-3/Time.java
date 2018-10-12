import java.util.*;

public class Time {

	public static void main(String[] args) {
		Map<Integer,String> dd= new LinkedHashMap<>();
		dd.put(1, "one");dd.put(2, "two");dd.put(3, "Three");dd.put(4, "Four");dd.put(5, "Five");dd.put(6, "Six");dd.put(7, "Seven");dd.put(8, "Eight");dd.put(9, "nine");dd.put(10, "Ten");dd.put(11, "eleven");dd.put(12, "Twelve");dd.put(13, "Thirteen");dd.put(14, "Fourteen");dd.put(15, "Fifteen");dd.put(16, "Sixteen");dd.put(17, "Seventeen");dd.put(18, "Eighteen");dd.put(19, "Nineteen");dd.put(20, "Twenty");dd.put(21, "Twenty one");dd.put(22, "Twenty two");dd.put(23, "Twenty three");dd.put(24, "Twenty four");dd.put(25, "Twenty five");dd.put(26, "Twenty six");dd.put(27, "Twenty seven");dd.put(28, "Twenty eight");dd.put(29, "Twenty Nine");dd.put(30, "Thirty");dd.put(31, "Thirty one");
		Map<Integer,String> mm= new LinkedHashMap<>();
		mm.put(01, "January");mm.put(02, "February");mm.put(03, "March");mm.put(04, "April");mm.put(05, "May");mm.put(06, "June");mm.put(07, "July");mm.put(08, "August");mm.put(09, "September");mm.put(10, "October");mm.put(11, "November");mm.put(12, "December");
	    Scanner scan = new Scanner(System.in);
	    String s= scan.next();
	    String d="",m="",y="";
	    int i=0,j=0;
	    if(s.length()<=10){
	    for(i=0;s.charAt(i)!='/';i++)
	    {
	    	d+=s.charAt(i);
	    }
	    for(j=i+1;s.charAt(j)!='/';j++)
	    {
	    	m+=s.charAt(j);
	    }
	    System.out.print(dd.get(Integer.parseInt(d))+" "+mm.get(Integer.parseInt(m))+" ");
	    for(int k=j+1;k<s.length();k++)
	    {
	    	y+=s.charAt(k);
	    	System.out.print(dd.get(Integer.parseInt(y))+" ");
	    	y="";
	    }}
	    else
	    	System.out.println("Invalid Date");
	}

}
import java.util.*;
class sync extends Thread {
  
  public synchronized void tab1()
  {
    for(int i=1;i<=500;i++)
    {
      System.out.println(i);
    }
  }
  public synchronized void tab2()
  {
    for(int i=501;i<=1000;i++)
    {
      System.out.println(i);
    }
  } 
    public void run(){
      
    tab1();
    tab2();  
      
    
  }
  
  public static void main(String[] args) {
    
    sync m=new sync();
    m.start();
    
    
    }
}
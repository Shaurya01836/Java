//ex 6.2

import java.lang.*;  
   
public class JoinDemo implements Runnable {  
    public void run()  
    {  
        Thread t = Thread.currentThread();  
        System.out.println("Current thread: "    + t.getName());  
   
        System.out.println(t.isAlive());  
    }  
   
    public static void main(String args[]) throws Exception  
    {  
        Thread t = new Thread(new JoinDemo());  
        t.start();  
   
          
        t.join(1000);  
   
        System.out.println("Current thread: "+ t.getName());  
   
        System.out.println(t.isAlive());  
    }  
} 
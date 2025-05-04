// 6. Develop applications involving concurrency: Processes and Threads, Thread 
// Objects, Defining and Starting a Thread, Pausing Execution with Sleep, 
// Interrupts, Joins, and Synchronization.
// ex 6.1

import java.lang.*;  
public class SleepDemo implements Runnable {  
    Thread t;  
    public void run()  
    {  
        for (int i = 0; i < 4; i++) {  
            System.out.println(Thread.currentThread().getName() + " "  + i);  
            try {  
                Thread.sleep(5000);  
            }  
   
            catch (Exception e) {  
                System.out.println(e);  
            }  
        }  
    }  
   
    public static void main(String[] args) throws Exception  
    {  
        Thread t = new Thread(new SleepDemo());  
        t.start();  
   
        Thread t2 = new Thread(new SleepDemo());  
   
        t2.start();  
    }  
}
        
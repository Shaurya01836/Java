// ex 6.3
//Thread Synchronization

class Counter { 
    private int c = 0;  
    public synchronized void inc() { 
        c++; 
    } 
 
    public synchronized int get() { 
        return c; 
    } 
} 
 
public class ThreadDemo { 
    public static void main(String[] args) { 
        Counter cn = new Counter();  
 
        Thread t1 = new Thread(() -> { 
            for (int i = 0; i < 1000; i++) { 
                cn.inc(); 
            } 
        }); 
 
        Thread t2 = new Thread(() -> { 
            for (int i = 0; i < 1000; i++) { 
                cn.inc(); 
            } 
        }); 
 
         
        t1.start(); 
        t2.start(); 
 
         
        try { 
            t1.join(); 
            t2.join(); 
        } catch (InterruptedException e) { 
            e.printStackTrace(); 
        } 
 
        System.out.println("Counter: " + cn.get()); 
    } 
} 

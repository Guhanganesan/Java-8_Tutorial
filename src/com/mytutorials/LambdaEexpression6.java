package com.mytutorials;

public class LambdaEexpression6{  
	
    public static void main(String[] args) {  
      
        // Thread Example without lambda  
        Runnable obj1 = new Runnable(){  
            public void run(){  
                System.out.println("Thread1 is running...");  
            }  
        };
        Thread t1 = new Thread(obj1);  // pass object in this Thread
        t1.start(); 
        
        
        // Thread Example with lambda  
        Runnable obj2 = ()->{  
                System.out.println("Thread2 is running...");  
        };  
        Thread t2 = new Thread(obj2);  
        t2.start();  
    }  
}  
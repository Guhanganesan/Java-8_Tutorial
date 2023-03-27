package com.method_references;

// ContainingClass::staticMethodName

interface Sayable{  
    void say();  
} 


public class StaticMethodExample {

	public static void saySomething(){  
        System.out.println("Hello, this is static method.");  
    }  
	
    public static void main(String[] args) {  
        // Referring static method  
        Sayable sayable = StaticMethodExample::saySomething;  
        // Calling interface method  
        sayable.say();  
    }  
    
}

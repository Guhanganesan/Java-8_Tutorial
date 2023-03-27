package com.method_references;

  
public class InstanceMethodExample { 
	
    public void saySomething(){  
        System.out.println("Hello, this is non-static method.");  
    }  
    
    public static void main(String[] args) {  
    		
    		// Creating object
    		InstanceMethodExample obj = new InstanceMethodExample();   
        	
    		// Referring non-static method using reference  
            Sayable sayable = obj::saySomething;  
        
            // Calling interface method  
            sayable.say();  
            
            // Referring non-static method using anonymous object  
            Sayable obj1 = new InstanceMethodExample()::saySomething; // You can use anonymous object also  
           
            // Calling interface method  
            obj1.say();  
    }  
}  
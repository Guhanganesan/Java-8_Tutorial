package com.mytutorials;
import java.util.*;

public class LambdaExpression4{  
    public static void main(String[] args) {  
          
        List<String> list=new ArrayList<String>();  
        list.add("Guhan");  
        list.add("Ganesan");  
        list.add("Anbu");  
        list.add("Amudhan");  
          
        list.forEach( 
        				(item) -> System.out.println(item)
        		);  
    } 
}  

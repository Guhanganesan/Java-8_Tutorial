package com.mytutorials;

@FunctionalInterface  //It is optional  
interface Drawable{  
    public void draw();  
}  
  
public class LambdaExpression1 {  
    public static void main(String[] args) {  
        int width=10;  
          
        //with lambda  
        Drawable obj = ()->{  
            System.out.println("Drawing "+width);  
        };  
        obj.draw();  
    }  
} 
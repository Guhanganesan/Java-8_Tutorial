package com.mytutorials;
import java.util.*;

public class StreamAPIExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = Arrays.asList("Java ", "", "Coding", "", " Learning","");
		
		long count = list.stream().filter(x -> x.isEmpty()).count();
		
		System.out.println("Count: "+ count);
		
	}

}

/* Result => Count: 3
 * 
 */

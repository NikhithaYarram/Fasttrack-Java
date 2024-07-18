package com.Day4;
import java.util.*;
public class CollectionStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Stack<String> stack = new Stack<String>();
        stack.push("Nik");
        stack.push("itha");
        stack.push("Yarr");
        stack.push("am");
  
        // Iterator for the stack
        Iterator<String> itr
            = stack.iterator();
  
        // Printing the stack
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
            System.out.println();
            
            stack.pop();
      
            // Iterator for the stack
            itr = stack.iterator();
      
            // Printing the stack
            while (itr.hasNext()) {
                System.out.print(itr.next() + " ");

            }
        }
	}

}

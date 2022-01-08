

package stackandqueue;

import java.util.*;
import java.io.*;
public class push_pop_peek {
	
	static void stack_push(Stack<Integer>stack) {
	for	(int i=0; i<5; i++) {
		
		stack.push(i);
	}
	}
	 static void stack_pop(Stack<Integer> stack)
	    {
	        System.out.println("Pop Operation:");
	 
	        for(int i = 0; i < 5; i++)
	        {
	            Integer y = (Integer) stack.pop();
	            System.out.println(y);
	        }
	    }
	static void stack_peek(Stack<Integer> stack)
    {
		Integer element = (Integer) stack.peek();
        System.out.println("Element on stack top: " + element);
    }
	public static void main(String[]args) {
	
		//stack<integer>stack= new stack<integer>();
		 Stack<Integer> stack = new Stack<Integer>();
		 stack_push(stack);
	      stack_pop(stack);
	        stack_push(stack);
	       stack_peek(stack);
		
	}
}
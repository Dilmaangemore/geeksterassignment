package stackandqueue;
import java.util.*;
public class ValidPharentheeses {

	static boolean isValid(String expr)
    {
        // Using ArrayDeque 
        Deque<Character> stack
            = new ArrayDeque<Character>();
  
       
        for (int i = 0; i < expr.length(); i++) 
        {
            char x = expr.charAt(i);
  
            if (x == '(' || x == '[' || x == '{') 
            {
                
                stack.push(x);
                continue;
            }
  
           
         
            if (stack.isEmpty())
                return false;
            char check;
            switch (x) {
            case ')':
                check = stack.pop();
                if (check == '{' || check == '[')
                    return false;
                break;
  
            case '}':
                check = stack.pop();
                if (check == '(' || check == '[')
                    return false;
                break;
  
            case ']':
                check = stack.pop();
                if (check == '(' || check == '{')
                    return false;
                break;
            }
        }
  
        
        return (stack.isEmpty());
    }
  
    
    public static void main(String[] args)
    {
        String expr = "([{}])";
  
        // Function call
        if (isValid(expr))
            System.out.println("valid ");
        else
            System.out.println("Not valid");
    }
}

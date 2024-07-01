package collections;
 
import java.util.Stack;
//main class.
public class StateStack {
	
	public static void main(String args[]) {
		
		// Create a stack to hold strings
		Stack<String> stack = new Stack<String>();
		
		// Adding elements to the stack
		stack.add("Bihar=63.82%");
		stack.add("Arunachal Pradesh=67%");
		stack.add("Telangana=72.8%");
		stack.add("Goa=92.81");
		stack.add("Delhi=93.7");
		stack.add("Lakshadweep=96.11");
		stack.add("Kerala=97.4");
		
		// Print the entire stack
		System.out.println("Stack contents: " + stack);
		
		// Peek at the top element without removing it
		System.out.println("Top element (peek): " + stack.peek());
		
		// Search for an element in the stack and return its position (1-based index)
		System.out.println("Position of 'Goa=92.81' in stack: " + stack.search("Goa=92.81"));
	}

}


public class StackExample {

	public static void main(String[] args) {
		Stack myStack = new Stack(5);
		int number = 1973;
		
		while(number>0) {
			myStack.push((int)number%2);
			number = (int)number/2;
		}

		while(!myStack.isEmpty()) {
			System.out.println("Element " + myStack.pop() + " pushed from stack.");
		}
	}

}

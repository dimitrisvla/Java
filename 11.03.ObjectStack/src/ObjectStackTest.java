
public class ObjectStackTest {

	public static void main(String[] args) {
		ObjectStack stack = new ObjectStack();
		
		Double i = new Double(151.151);
		String s = "Hello World!";
		
		stack.push(s);
		stack.push(i);
	}

}

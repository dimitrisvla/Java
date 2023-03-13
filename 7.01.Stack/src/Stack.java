
public class Stack {

	private StackElement head;
	private int size = 0;
	
	public int pop() {
		if(size == 0) {
			System.out.println("Pop from empty stack.");
			System.exit(-1);
		}
		int value = head.getValue();
		head = head.getNext();
		size --;
		return value;
	}
	
	public void push(int value) {
		StackElement element = new StackElement(value);
		element.setNext(head);
		head = element;
		size++;
	}
	
}

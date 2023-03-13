
public class Stack<T> {

	private StackElement<T> head;
	private int size = 0;
	
	public T pop() {
		if(size == 0) {
			System.out.println("Pop from empty stack is mot possible!");
		}
		T value = head.getValue();
		head = head.getNext();
		size--;
		
		return value;
	}

	public void push(T value) {
		StackElement<T> element = new StackElement<T>(value);
		element.setNext(head);
		head = element;
		size++;
	}
}

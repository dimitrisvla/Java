
public class ObjectStack {

	private ObjectStackElement head;
	private int size = 0;
	
	public Object pop() {
		if(size == 0) {  // head = null
			System.out.println("Stack is already empty!");
			System.exit(-1);
		}
		Object value = head.getValue();
		head = head.getNext();
		size--;
	
		return value;
	}
	
	
	public void push(Object value) {
		ObjectStackElement element = new ObjectStackElement(value);
		element.setNext(head);
		head = element;
		size++;
	}
}

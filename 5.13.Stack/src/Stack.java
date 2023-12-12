
public class Stack {

	private int capacity;
	private int size = 0;
	private int[] elements;
	
	public Stack(int capacity) {
		this.capacity = capacity;
		elements = new int [capacity];
	}
	
	public void push(int element) {
		if(size == capacity) {
			System.out.println("The stack is full!\nCan't push a new element");
			return;
		}
		System.out.println("Element " + element + " pushed.");
		elements[size] = element;
		size++;
	}
	
	public int pop() {
		if(size == 0) {
			System.out.println("No elements to pop");
			return -1;
		}
		size --;
		
		return elements[size];
	}
	
	public boolean isEmpty() {
		return(size == 0);
	}
}

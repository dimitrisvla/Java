
public class StackElement {

	private int value;
	private StackElement next = null;
	
	public StackElement(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	public StackElement getNext() {
		return next;
	}
	
	public void setNext(StackElement element) {
		next = element;
	}
	
}

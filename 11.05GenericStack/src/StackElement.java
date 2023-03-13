
public class StackElement<T> {

	private T value;
	private StackElement<T> next;
	
	public StackElement(T value) {
		super();
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public StackElement<T> getNext() {
		return next;
	}

	public void setNext(StackElement<T> next) {
		this.next = next;
	}
	
	
}


public class ObjectStackElement {
	private Object value;
	private ObjectStackElement next;
	
	public ObjectStackElement(Object val) {
		value = val;
	}

	public ObjectStackElement getNext() {
		return next;
	}

	public void setNext(ObjectStackElement nextElement) {
		this.next = nextElement;
	}

	public Object getValue() {
		return value;
	}
	
	
}

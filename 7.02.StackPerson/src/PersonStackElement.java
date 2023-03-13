
public class PersonStackElement {

	private Person value;
	private PersonStackElement next;
	
	public PersonStackElement(Person val) {
		value = val;
	}
	
	public void setNext(PersonStackElement element) {
		next = element;
	}
	
	public PersonStackElement getNext() {
		return next;
	}
	
	public Person getValue() {
		return value;
	}
}

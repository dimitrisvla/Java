
public class BadNumberException extends Exception {
	private int badNumber;

	public BadNumberException(int badNumber) {
		this.badNumber = badNumber;
	}
	
	public BadNumberException() { }
	
	public BadNumberException(String message) {
		super(message);
	}

	public int getBadNumber() {
		return badNumber;
	}
	
}

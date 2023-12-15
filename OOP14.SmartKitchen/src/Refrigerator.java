
public class Refrigerator {

	private boolean hasWorkToDo;

	public void setHasWorkToDo(boolean hasWorkToDo) {
		this.hasWorkToDo = hasWorkToDo;
	}
	
	public void orderFood() {
		if(hasWorkToDo) {
			hasWorkToDo = false;
			System.out.println("Ordering food...");
		}
	}
}

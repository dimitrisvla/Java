
public class Professor {
	
	private String name;
	private int AFM;
	private Course lesson;
	
	public Professor(String name, int afm) {
		this.name = name;
		this.AFM = afm;
	}
	
	public void setLesson(Course c) {
		lesson = c;
	}
	
	public String toString() {
		return name + " " + AFM + " " + lesson;
	}
	
}

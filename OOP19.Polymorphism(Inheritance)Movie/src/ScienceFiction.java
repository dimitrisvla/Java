
public class ScienceFiction extends Movie{

	public ScienceFiction(String title) {
		super(title);
	}
	
	public void watchMovie() {
		super.watchMovie();
		System.out.printf("..%s%n".repeat(3),
				"Aliens attack",
				"Human race fights back",
				"Earth is safe...");
	}

}


public class Adventure extends Movie{

	public Adventure(String title) {
		super(title);
	}

	public void watchMovie() {
		super.watchMovie();
		System.out.printf("..%s%n".repeat(3),
				"Funny Scene",
				"Fight Music",
				"Bad guys lose...");
	}
}

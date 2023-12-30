
public class Comedy extends Movie{

	public Comedy(String title) {
		super(title);
	}

	public void watchMovie() {
		super.watchMovie();
		System.out.printf("..%s%n".repeat(3),
				"Funny stuff happens",
				"Heroes do stupid things",
				"Happy/Unrealistic ending");
	}
}

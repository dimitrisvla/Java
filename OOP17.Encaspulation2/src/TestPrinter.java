
public class TestPrinter {

	public static void main(String[] args) {
		Printer printer1 = new Printer(80, true);
		printer1.addToner(5);
		System.out.println("pages needed to print: " + printer1.printPages(100));
		
		Printer printer2 = new Printer(50, false);
		printer2.addToner(15);
		System.out.println("pages needed to print: " + printer2.printPages(100));
	}

}

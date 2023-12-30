
public class Printer {
	private int tonerLevel;
	private int pagesPrinted;
	private boolean duplex;
	
	
	public Printer(int tonerLevel, boolean duplex) {
		this.pagesPrinted = 0;

		if(tonerLevel<=-1 || tonerLevel>100) {
			this.tonerLevel = -1;
		}else {
			this.tonerLevel = tonerLevel;
		}

		this.duplex = duplex;
	}
	
	public int addToner(int tonerAmount) {
		if(tonerAmount<0 || tonerAmount>100 || (tonerAmount+tonerLevel>100)) {
			return -1;
		}
		return tonerAmount+tonerLevel;
	}
	
	public int printPages(int pages) {
		int pagesToPrint;
		
		pagesToPrint = pages;
		if(duplex) {
			System.out.println("Printer is duplex.");
			int division,modDivision;
			division = pages/2;
			modDivision = division/2;
			pagesToPrint = division + modDivision;
		}
		pagesPrinted += pagesToPrint;
		System.out.println("Pages to print: " + pagesToPrint);
		return pagesToPrint;
	}
	
	public int getPagesPrinted() {
		return pagesPrinted;
	}
	
}

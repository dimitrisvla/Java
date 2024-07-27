import java.util.ArrayList;

public class Portofolio {

	public static void main(String[] args) {
		ArrayList<Asset> myPortofolio = new ArrayList<Asset>();
		myPortofolio.add(new Cash(1000));
		
		DividendStock msft = new DividendStock("MSFT",100, 39); 
		myPortofolio.add(msft);
		msft.setCurrentPrice(40);
		msft.payDividends(0.5);
		
		MutualFund fund = new MutualFund("FUND", 10.5, 30);
		myPortofolio.add(fund);
		fund.setCurrentPrice(40);
		fund.purchase(3.5, 40);
		
		Stock appl = new Stock("APPL", 10, 100);
		myPortofolio.add(appl);
		appl.setCurrentPrice(97);
		
		double totalValue = 0;
		double totalProfit = 0;
		for(Asset a: myPortofolio) {
			System.out.println(a+"\n");
			totalValue += a.getMarketValue();
			totalProfit += a.getProfit();
		}
		System.out.println("\nTotal value = "+ totalValue);
		System.out.println("\nTotal profit = "+ totalProfit);
	}

}

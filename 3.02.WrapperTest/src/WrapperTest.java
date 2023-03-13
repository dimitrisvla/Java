
public class WrapperTest {

	public static void main(String[] args) {
		
		int i = Integer.valueOf("2");
		double d = Double.parseDouble("2.5");
		System.out.println(i*d);
		
		Integer x = 5;
		Double y = 2.5;
		String s = x.toString() + y.toString();
		System.out.println(s);
		System.out.println(Integer.MAX_VALUE);

	}

}

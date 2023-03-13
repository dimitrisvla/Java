
public class StringExample {

	public static void main(String[] args) {
		String x = new String("introduction to java programming");
		String y =  "java";
		
		int offset = x.indexOf(y);
		int end = x.length();
		x = x.substring(offset, end);
		
		System.out.println(offset);
		System.out.println(end);
		System.out.println(x);

	}

}

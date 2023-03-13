
public class LocalVariableTest {

	private int var = 10;
	
	public void method1() {
		int var = 5;
		var++;
	}
	
	public void method2(int var) {
		var++;
	}
	
	public void method3() {
		int var = 1;
		this.var = var;
	}
	
	public void printVar() {
		System.out.println("var = " + var);
	}
	
	public static void main(String[] args) {
		LocalVariableTest x = new LocalVariableTest();
		int var = 3;
		x.method1(); x.printVar();
		x.method2(var); x.printVar();
		x.method3(); x.printVar();
		System.out.println(var);
	}

}


public class ComplexNumber {

	private double real;
	private double imaginary;
	
	public ComplexNumber(double real, double imaginary) {
		super();
		this.real = real;
		this.imaginary = imaginary;
	}

	public double getReal() {
		return real;
	}

	public double getImaginary() {
		return imaginary;
	}
	
	public void add(double a, double b) {
		this.real += a;
		this.imaginary += b;
	}
	
	public void add(ComplexNumber complexnum) {
		this.real += complexnum.getReal();
		this.imaginary += complexnum.getImaginary();
	}
	
	public void subtract(double a, double b) {
		this.real -= a;
		this.imaginary -= b;
	}
	
	public void subtract(ComplexNumber complexnum) {
		this.real -= complexnum.getReal();
		this.imaginary -= complexnum.getImaginary();
	}
}

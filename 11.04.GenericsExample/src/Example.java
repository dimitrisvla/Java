
public class Example<T> {
	private T data;

	public Example(T data) {
		super();
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	public static void main(String[] args) {
		Example<String> ex = new Example<String>("hello world!");
		System.out.println(ex.getData());
		
		Example<String> ex2 = new Example<String>("hello jim!");
		System.out.println(ex2.getData());
	}

}


public class Example<T> {

	private T data;

	public static void main(String []args) {
		Example<String> example = new Example<String>("Hello World");
		System.out.println(example.getData());
	}
	
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
	
}

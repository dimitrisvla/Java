
public class TestCustomer {

	public static void main(String[] args) {
		
		Customer c1 = new Customer("jim Vl", 150.7, "benovla@yahoo.gr");
		System.out.println(c1.getName());
		System.out.println(c1.getCreditLimit());
		System.out.println(c1.getEmail());
		System.out.println();
		Customer c2 = new Customer();
		System.out.println(c2.getName());
		System.out.println(c2.getCreditLimit());
		System.out.println(c2.getEmail());
		System.out.println();
		Customer c3 = new Customer("Maria Vl", "mariavl@gmail.com");
		System.out.println(c3.getName());
		System.out.println(c3.getCreditLimit());
		System.out.println(c3.getEmail());
	}

}

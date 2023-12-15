
public class Main {

	public static void main(String[] args) {
		Employee jim = new Employee("Jim", "15/01/1990",
                "01/01/2020");
        System.out.println(jim);
        System.out.println("\t\tAge = " + jim.getAge());
        System.out.println("\t\tPay = " + jim.collectPay());

        SalariedEmployee kostas = new SalariedEmployee("Kostas", "12/05/1994",
                "01/01/2020", 25000);
        System.out.println(kostas);
        System.out.println("\t\tAge = " + kostas.getAge());
        System.out.println("\t\tPay = " + kostas.collectPay());
        kostas.retire();
        System.out.println("Joe's Pension check = $" + kostas.collectPay());

        HourlyEmployee mary = new HourlyEmployee("Mary", "05/05/1970",
                "03/03/2021", 24);
        System.out.println(mary);
        System.out.println("Mary's Paycheck = $" + mary.collectPay());
        System.out.println("Mary's Holiday Pay = $" + mary.getDoublePay());
        kostas.retire();
        System.out.println("Joe's Pension check = $" + kostas.collectPay());

	}   

}

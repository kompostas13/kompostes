package GeneralPackage;

public class Secretaries extends Users {
	
	private final int eID;
	private int salary;
	
	public Secretaries(int i, int salary, String username, String name, String surname, String dept) {
		super(username, name, surname, dept);
		eID= i;
		this.salary= salary;
	}

}

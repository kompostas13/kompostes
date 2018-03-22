package GeneralPackage;

public class Professors extends Users {
	
	private final int pID;
	private int salary;
	
	public Professors(int i, int salary, String username, String name, String surname, String dept) {
		super(username, name, surname, dept);
		pID= i;
		this.salary= salary;
	}

}

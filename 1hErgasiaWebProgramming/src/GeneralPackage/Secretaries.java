package GeneralPackage;

import java.util.Scanner;

public class Secretaries extends Users {
	
	private final int eID;
	private int salary;
	
	public Secretaries() {
		super();
		Scanner keyboard= new Scanner(System.in);
		System.out.println("Please enter secretarie ID: \n");
		eID= keyboard.nextInt();
		System.out.println("Please enter secretarie salary: \n");
		setSalary(keyboard.nextInt());
		keyboard.close();
	}
	
	public Secretaries(String username, String name, String surname, String dept, int i, int salary) {
		super(username, name, surname, dept);
		eID= i;
		setSalary(salary);
	}

	/**
	 * @return the eID
	 */
	public int geteID() {
		return eID;
	}

	/**
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}

}

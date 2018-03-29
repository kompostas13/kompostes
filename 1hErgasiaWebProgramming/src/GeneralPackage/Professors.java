package GeneralPackage;

import java.util.Scanner;

public class Professors extends Users {
	
	private final int pID;
	private int salary;
	
	public Professors() {
		super();
		Scanner keyboard= new Scanner(System.in);
		System.out.println("Please enter professor ID: \n");
		pID= keyboard.nextInt();
		System.out.println("Please enter professor salary: \n");
		setSalary(keyboard.nextInt());
		keyboard.close();
	}
	
	public Professors(String username, String name, String surname, String dept, int id, int salary) {
		super(username, name, surname, dept);
		pID= id;
		setSalary(salary);
	}

	/**
	 * @return the pID
	 */
	public int getpID() {
		return pID;
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

package GeneralPackage;

import java.util.Scanner;

public class Users {
	
	private String username;
	private String name;
	private String surname;
	private String dept;
	private static int users_counter = 0;
	
	/**
	 * Class Constructor
	 */
	
	public Users() {
		Scanner keyboard=new Scanner(System.in);
		users_counter+=1;
		System.out.println("Please give username: \n");
		this.setUsername(keyboard.next());
		System.out.println("Please give first name: /n");
		this.setName(keyboard.next());
		System.out.println("Please give surname: /n");
		this.setSurname(keyboard.next());
		System.out.println("Please give dept name: /n");
		this.setDept(keyboard.next());
		//keyboard.close();
		
	}
	
	public Users(String username, String name, String surname, String dept) {
		setUsername(username);
		setName(name);
		setSurname(surname);
		setDept(dept);
	}
	
	public void printer() {
		System.out.println(getUsername() + "\n" + getName() + "\n" + getSurname() + "\n" + getDept() + "\n");
	}



	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}



	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}



	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}



	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}



	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}



	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}



	/**
	 * @return the dept
	 */
	public String getDept() {
		return dept;
	}



	/**
	 * @param dept the dept to set
	 */
	public void setDept(String dept) {
		this.dept = dept;
	}

	/**
	 * @return the users_counter
	 */
	public static int getUsers_counter() {
		return users_counter;
	}


}
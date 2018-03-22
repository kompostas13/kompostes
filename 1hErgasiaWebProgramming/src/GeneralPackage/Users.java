package GeneralPackage;

public class Users {
	
	private String username;
	private String name;
	private String surname;
	private String dept;
	private static int users_counter = 0;
	
	/**
	 * Class Constructor
	 */
	
	public Users(String username, String name, String surname, String dept) {
		users_counter+=1;
		//System.out.println("Please give username: \n");
		this.setUsername(username);
		//System.out.println("Please give first name: /n");
		this.setName(name);
		//System.out.println("Please give surname: /n");
		this.setSurname(surname);
		//System.out.println("Please give dept name: /n");
		this.setDept(dept);
		
	}
	
	public void printer() {
		System.out.println("Username: " + username + "\nName: "+ name + "\nSurname: " + surname + "\nDepartment: " + dept + "\n");
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
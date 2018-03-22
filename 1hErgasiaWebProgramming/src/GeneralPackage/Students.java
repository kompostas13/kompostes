package GeneralPackage;

public final class Students extends Users{
	
	private final int sID;
	private int semester;
	private Grades grades;
	
	
	public Students(int i, String username, String name, String surname, String dept) {
		super(username, name, surname, dept);
		sID= i;
		semester= 1;
		grades= new Grades();
		
	}
	
	public void printer() {
		System.out.println("ID: " + sID + "\nUsername: " + getUsername() + "\nName: "+ getName() + "\nSurname: " + getSurname() + "\nDepartment: " + getDept() + "\nSemester: " + semester + "\n");

	}

	/**
	 * @return the grades
	 */
	public Grades getGrades() {
		return grades;
	}

	/**
	 * @param grades the grades to set
	 */
	public void setGrades(Grades grades) {
		this.grades = grades;
	}
	
	

}

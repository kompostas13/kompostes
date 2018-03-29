package GeneralPackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public final class Students extends Users{
	
	//Map sMap = new HashMap<Students, String>();
	private final Integer sID;
	private int semester;
	private Grades grades;
	private Scanner keyboard= new Scanner(System.in);
	private int scounter = 0;
	private boolean flag = true;
	private int temp;
	
	public Students() {
		super();
		//Scanner keyboard= new Scanner(System.in);
		
		System.out.println("Please give student ID: \n");
		while(flag) {
			
			try {
				temp=Integer.parseInt(keyboard.next());
				flag = false;
			}
			catch(Exception e) {
				System.out.println("Please enter a valid ID");
			}				
		}
		this.sID = temp;
			
		setSemester(1);
		grades= new Grades();
		keyboard.close();
		
		//sMap.put(this, super.getUsername());
		scounter += 1;
		
	}

	public Students(String username, String name, String surname, String dept, Integer sID) {
		super(username, name, surname, dept);
		this.sID=sID;
		setSemester(1);
		grades=new Grades();
	}
	
	public void printer() {
		System.out.println("Username: " + getUsername() + "\n" + "Name: " + getName() + "\n" + "Surname: " + getSurname() + "\n" + "Department: " + getDept() + "\n" + "ID: " + getsID() + "\n" + "Semester: " + getSemester() + "\n")
		;
	}
	
	public static int getKey(HashMap m, Students s) {
		return s.getKey(m, s);
	}
	
	public static Object getValue(HashMap m, String key) {
		
		return m.get(key);
		
		
	}
	
	public int getsID() {
		return sID;
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

	/**
	 * @return the semester
	 */
	public int getSemester() {
		return semester;
	}

	/**
	 * @param semester the semester to set
	 */
	public void setSemester(int semester) {
		this.semester = semester;
	}
	
	

}

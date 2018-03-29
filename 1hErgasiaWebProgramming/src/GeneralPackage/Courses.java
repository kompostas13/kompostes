package GeneralPackage;

public class Courses {
	
	private String course_name;
	private final int course_ID;
	private String dept_name;
	private Professors course_prof;
	public static int counter;
	
	
	public Courses(int cID, String cname) {
		
		this.course_ID = cID;
		setCourse_name(cname);
		//this.course_prof= prof;
		plusCounter();
		//Grades.addCourse(this);
	}
	
	public Courses(int cID, String cname, String dept) {
		
		this.course_ID = cID;
		setDept_name(dept);
		setCourse_name(cname);
		//this.course_prof= prof;
		plusCounter();
	}
	
	public void plusCounter(){
		counter+=1;
	}
	
	public int getCounter() {
		return counter;
	}


	/**
	 * @return the course_name
	 */
	public String getCourse_name() {
		return course_name;
	}


	/**
	 * @param course_name the course_name to set
	 */
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}



	/**
	 * @return the course_prof
	 */
	public Professors getCourse_prof() {
		return course_prof;
	}


	/**
	 * @param course_prof the course_prof to set
	 */
	public void setCourse_prof(Professors course_prof) {
		this.course_prof = course_prof;
	}

	/**
	 * @return the course_ID
	 */
	public int getCourse_ID() {
		return course_ID;
	}

	/**
	 * @return the dept_name
	 */
	public String getDept_name() {
		return dept_name;
	}

	/**
	 * @param dept_name the dept_name to set
	 */
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}

}

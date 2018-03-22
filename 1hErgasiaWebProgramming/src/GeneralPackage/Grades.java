package GeneralPackage;

import java.util.ArrayList;
import java.util.List;

public class Grades {

	
	public List<Courses> courseList;
	public List<Integer> gradeList;
	private int cid;
	private int grade;
	private static int index;
	
	public Grades() {
		courseList = new ArrayList<>();
		gradeList = new ArrayList<>();
	}
	
	public void setIndex() {
		index+=1;
	}
	
	public void addCourse(Courses c1) {
			courseList.add(c1);
			gradeList.add(0);
	}
	
	public void showLists() {
		for (int i=0; i< courseList.size(); i++) {
			Courses c=courseList.get(i);
			//System.out.println(courseList.size());
			System.out.println(c.getCourse_name());
			System.out.println(gradeList.get(i));
		} 
		
		if (courseList.size()<1) {
			System.out.println("no courses");
		}
	}
	
	public void SetList(int cid, int grade) {
		//courseList.add(cid);
		gradeList.add(grade);
	}
}

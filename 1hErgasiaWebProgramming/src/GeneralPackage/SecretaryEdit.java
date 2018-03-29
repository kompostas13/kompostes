package GeneralPackage;

import java.util.Scanner;

public class SecretaryEdit {
	
	//private Students[] st = new Students[999]
	public static Students[] st = CreateUsers2.s;
	public static int c = CreateUsers2.counter;
	
	public static void addStudent() {
		st[c] = new Students();
		
		st[c].printer();
		
		c+=1;
	}
	
	public void addProfessor() {
		Professors p = new Professors();
		
	}
	
	public void addLesson() {
		
		Scanner sc = new Scanner(System.in);
		int cid = sc.nextInt();
		String cname = sc.next();
		Courses c = new Courses(cid, cname);
		
	}
	
	public static void lessonAssignment(Courses c, Professors p) {
		c.setCourse_prof(p);
	}
}

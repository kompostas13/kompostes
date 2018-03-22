package GeneralPackage;

import java.util.Scanner;


public class CreateUsers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner keyboard = new Scanner(System.in);
		//System.out.println("Please give username: ");
		//String username = keyboard.next();
		//System.out.println("Please give first name: ");
		//String name = keyboard.next();
		//System.out.println("Please give surname: ");
		//String surname = keyboard.next();
		//System.out.println("Please give dept name: ");
		//String dept = keyboard.next();
		//Users user1 = new Users(username, name, surname, dept);
		//user1.printer();
		//keyboard.close();
		//System.out.println(user1.getUsers_counter());
		
		Students s1= new Students (16029, "kompo", "kompoo", "kompooo", "informatics");
		Students s2= new Students (16028, "ompo", "ompoo", "ompooo", "informatics");
		
		Courses c1= new Courses(111, "java2");
		Courses c2= new Courses(11, "java3");
		s1.getGrades().addCourse(c1);
		s1.getGrades().addCourse(c2);
		s1.printer();
		s1.getGrades().showLists();
		s2.printer();
		s2.getGrades().showLists();
	}

}

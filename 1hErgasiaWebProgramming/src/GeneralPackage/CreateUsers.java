package GeneralPackage;

import java.io.File;
import java.util.Scanner;


public class CreateUsers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String line;
		String[] details;
		String name; 
		String username;
		String surname;
		String dept;
		String sID;
		int c = 0;
		Students[] s = new Students[999];
		File f = null;
		Scanner sc = null;
		boolean flag = true;
		
		int errors = 0;
		
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
			try {
			
		
				f = new File("MOCK_DATA.txt");
				sc = new Scanner(f);
		 
			}
			
			catch(Exception e){
					//e.printStackTrace();
					System.out.println("File wasn't found... Sorry!");
					System.exit(0);
			}
			
			while(flag) {
			
					//try{
						while(sc.hasNextLine()){
							
							try {
							line = sc.nextLine();
							details = line.split("\\.");
							username = details[0];
							name = details[1];
							surname = details[2];
							dept = details[3];
							sID = details[4];
						
							s[c] = new Students(username, name, surname, dept, Integer.parseInt(sID));
							c += 1;
							}
							catch(Throwable e){
									errors+=1;
									//System.out.println("Exception.... Something wrong with record no. " + c + "\n");
									
								}
							
						}
						if(sc.hasNextLine() == false) {
							flag = false;
						}
					//}
					//catch(Exception e){
					//	System.out.println("Exception.... Something wrong with record no. ");
						
					//}
					
			}
			

				
		 //System.out.println(arg0);
		 
		 //for(int i = 0; i < c; i++) {
		 //	 s[i].printer();
		 //}
		 
		 
		 //int i;
		 //while((i=bin.read())!=-1){    
			// System.out.print(in.next() + "\n");    
		 //} 
		 
		 
		 //System.out.println(in.next() + "\n\n\n\n\n\n\n\n\n");
		    
		    

			

		
		
		
		
		
		
		
		
		//Students s1= new Students ();
		//Students s2= new Students ();
		
		/*Courses c1= new Courses(111, "java2", "Informatics");
		Courses c2= new Courses(11, "micro", "Economics");
		Courses c3= new Courses(21, "micro2", "Economics");
		Courses c4= new Courses(31, "macro", "Economics");
		Courses c5= new Courses(411, "C Sharp", "Informatics");
		for(int i = 0; i < c; i ++) {
			if(c1.getDept_name().equals(s[i].getDept())) {
				s[i].getGrades().addCourse(c1);	
			}
			if (c2.getDept_name().equals(s[i].getDept())) {
				s[i].getGrades().addCourse(c2);
			}
			if(c3.getDept_name().equals(s[i].getDept())) {
				s[i].getGrades().addCourse(c3);
			}
			if(c4.getDept_name().equals(s[i].getDept())) {
				s[i].getGrades().addCourse(c4);
			}
			if(c5.getDept_name().equals(s[i].getDept())) {
				s[i].getGrades().addCourse(c5);
			}
		}*/
		//s1.getGrades().addCourse(c1);
		//s1.getGrades().addCourse(c2);
		for(int j = 0; j < c; j++) {
			s[j].printer();
			s[j].getGrades().showLists();
		}
		System.out.println(errors + " errors while creating students from file! \n");
	}

}

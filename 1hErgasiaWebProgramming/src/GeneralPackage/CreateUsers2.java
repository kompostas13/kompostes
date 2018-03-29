package GeneralPackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.IllegalFormatException;
import java.util.Scanner;



public class CreateUsers2 {
	
	
	static int counter = 0;
	static Students[] s = new Students[999];
	
	
	/*public void createInput() {
		//in case you wanna add user by keyboard
		Scanner input = new Scanner(System.in);
        //create the try-catch code for add a new user
        try {
            int ID = correctInputInt("ID");
            String username = correctInputString("username");
            String name = correctInputString("name");
            String surname = correctInputString("surname");
            String dept = correctInputString("department");

            Students s= new Students (username, name, surname, dept,ID);
        }
        catch(Exception e){
            System.out.println("Entry failed!");
        }
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //in case you wanna add users from text file
		String line;
		String[] details;
		String name; 
		String username;
		String surname;
		String dept;
		String sID;
		File f = null;
		Scanner sc = null;
		Scanner answer = null;
		boolean flag = true;
		String st= "y";
		int errors = 0;
		answer = new Scanner(System.in);
		System.out.println("Would you like the secretary to add a student? Y / N \n");
		if(answer.next().equalsIgnoreCase(st)) {
			SecretaryEdit.addStudent();			
		}

			try {
			
		
				f = new File("Students.txt");
				sc = new Scanner(f);
		 
			}
			
			catch(FileNotFoundException e){
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
							
								s[counter] = new Students(username, name, surname, dept, Integer.parseInt(sID));
								counter += 1;
							}
							catch(Exception e){
									errors+=1;
									//System.out.println("Exception.... Something wrong with record no. " + c + "\n");								
							}
							
						}
						if(sc.hasNextLine() == false) {
							flag = false;
						}					
			}
			
			
		for(int j = 0; j < counter; j++) {
			s[j].printer();
			s[j].getGrades().showLists();
		}
		System.out.println(errors + " errors while creating students from file! \n");
	}
	
	// gets the input and check for illegal formats
    private static String correctInputString(String param)
    {
        Scanner input = new Scanner(System.in);
        String givesBack=""; //just an initialize
        boolean flag = false;

        System.out.print("Enter the "+param);
        while(!flag){
            try{
                givesBack = input.nextLine();
                flag = true;
            }
            catch (IllegalFormatException e){
                System.out.println("It's not string!");
            }
        }
        return givesBack;
    }

    private static int correctInputInt(String param)
    {
        Scanner input = new Scanner(System.in);
        int givesBack=0; //just an initialize
        boolean flag = false;

        System.out.print("Enter the "+param);
        while(!flag){
            try{
                givesBack = input.nextInt();
                flag = true;
            }
            catch (NumberFormatException e){
                System.out.println("It's not an integer!");
            }
        }
        return givesBack;
    }

}

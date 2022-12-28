package school;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in).useDelimiter("\n");
		Scanner scan1 = new Scanner(System.in);
		
		
		ArrayList<Department> depList = new ArrayList<>();
		
		Stack <String> inputtStack = new Stack<>();
		
		
		System.out.println("\n🏫🏫🏫🏫🏫🏫🏫🏫👉 Welcome to Our School System 👈🏫🏫🏫🏫🏫🏫🏫🏫");
		School schoolObj = new School();
		
		System.out.println("\nPlease Enter School Name:");
		//schoolObj.setschoolName(scan.next());
		inputtStack.push(scan.next());
		
		System.out.println("Please Enter School Type:");
		//schoolObj.setschoolType(scan.next());
		inputtStack.push(scan.next());
		
		System.out.println("Please Enter School Address:");
		//schoolObj.setschoolAddress(scan.next());
		inputtStack.push(scan.next());
				
		Boolean deptFlag = true;              ////Condition of the 1st while loop(Department)
		Boolean teacherFlag = true;			  ////Condition of the 2nd while loop(Teacher)
		Boolean studentFlag = true;			  ////Condition of the 3rd while loop(Student)
		Boolean coursetFlag = true;			  ////Condition of the 4th while loop(Course)
		
		
		while (deptFlag) { 
		///////////////////////Loop for Department///////////////////////////////
			Department depObj = new Department();
			System.out.println("Please Enter Department Name:");
			//depObj.setdepartmentName(scan.next());
			inputtStack.push(scan.next());
			
			System.out.println("Please Enter Department Floor:");
			//depObj.setnoOfFloors(scan1.nextInt());
			inputtStack.push(scan.next());
			
			
			while (teacherFlag) { 		
		    ///////////////////////Loop for Teacher//////////////////////////////
			Teacher teachobj = new Teacher();
			System.out.println("Please Enter Teacher Name:");
			//teachobj.setteacherName(scan.next());
			inputtStack.push(scan.next());
			
			System.out.println("Please Enter Teacher ID:");
			//teachobj.setteacherId(scan1.nextInt());
			inputtStack.push(scan.next());
			
			System.out.println("Please Enter Teacher Email:");
			//teachobj.setteacherEmail(scan.next());
			inputtStack.push(scan.next());
			
			while (studentFlag) { 
			///////////////////////Loop for Student ///////////////////////////////
			Student studobj = new Student ();
			System.out.println("Please Enter Student Name:");
			//studobj.setstudentName(scan.next());
			inputtStack.push(scan.next());
			
			System.out.println("Please Enter Student ID:");
			//studobj.setstudentId(scan1.nextInt());
			inputtStack.push(scan.next());
			
			System.out.println("Please Enter Student Email:");
			//studobj.setstudentEmail(scan.next());
			inputtStack.push(scan.next());
			

			
			while (coursetFlag) {
			///////////////////////Loop for Course///////////////////////////////
			Course courseobj = new Course ();
			System.out.println("Please Enter Course ID:");
			//courseobj.setcourseId(scan1.nextInt());
			inputtStack.push(scan.next());
			
			System.out.println("Please Enter Course Name:");
			//courseobj.setcourseName(scan.next());
			inputtStack.push(scan.next());
			
			//Mark mark = new Mark(); 
			System.out.println("Please Enter Mathematics Marks:");
			//courseobj.mark.setmathMark(scan1.nextInt());
			inputtStack.push(scan.next());
			
			System.out.println("Please Enter Information Technology Marks:");
			//courseobj.mark.setitMark(scan1.nextInt());
			inputtStack.push(scan.next());
			
			System.out.println("Please Enter English Language Marks:");
			//courseobj.mark.setenglishMark(scan1.nextInt());
			inputtStack.push(scan.next());
			
		
			
			/////////Adding Course to arrayList //////////
			studobj.corsList.add(courseobj);
			System.out.println("Do you want to add more Course? 1=yes/2=no");
			int Answer3 = scan1.nextInt();
			if (Answer3 == 2) {
				coursetFlag = false;
				} 
			}
			/////////Adding Student to arrayList //////////
			teachobj.studList.add(studobj);
			System.out.println("Do you want to add more Student ? 1=yes/2=no");
			int Answer2 = scan1.nextInt();
			if (Answer2 == 2) {
				studentFlag = false;
				} 
			}
			/////////Adding Teacher to arrayList //////////
			depObj.teacherList.add(teachobj);
			System.out.println("Do you want to add more Teacher? 1=yes/2=no");
			int Answer = scan1.nextInt();
			if (Answer == 2) { 
				teacherFlag = false; 	  
				} 
			}
			/////////Adding Department to arrayList //////////
			depList.add(depObj);
			System.out.println("Do you want to add more departments? 1=yes/2=no");
			int key = scan1.nextInt();
			if (key == 2) {
				deptFlag = false;
				} 
			}
	
		System.out.println("\n⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘");
		System.out.println("\n≣≣≣≣≣≣≣≣≣≣≣≣≣≣≣≣≣≣≣ School Details ≣≣≣≣≣≣≣≣≣≣≣≣≣≣≣≣≣≣≣");
		System.out.println("\n⫸⫸⫸ School Name : " + schoolObj.getschoolName());
		System.out.println("\n⫸⫸⫸ School Type : " + schoolObj.getschoolType());
		System.out.println("\n⫸⫸⫸ School Address : " + schoolObj.getschoolAddress());

		for (Department dep1 : depList ) {
			System.out.println("\n≣≣≣≣≣≣≣≣≣≣≣≣≣≣≣≣≣≣≣ Department Details ≣≣≣≣≣≣≣≣≣≣≣≣≣≣≣≣≣≣≣");
			System.out.println("\n⫸⫸⫸ Department Name : " + dep1.getdepartmentName());
			System.out.println("\n⫸⫸⫸ Department Floor : " + dep1.getnoOfFloors());

			for (Teacher teach1 : dep1.teacherList) {
				System.out.println("\n≣≣≣≣≣≣≣≣≣≣≣≣≣≣≣≣≣≣≣ Teacher Details ≣≣≣≣≣≣≣≣≣≣≣≣≣≣≣≣≣≣≣");
				System.out.println("\n⫸⫸⫸ Teacher Name : " + teach1.getteacherName());
				System.out.println("\n⫸⫸⫸ Teacher ID : " + teach1.teacherId());
				System.out.println("\n⫸⫸⫸ Teacher Email : " + teach1.getteacherEmail());

				for (Student stud1 : teach1.studList) {
					System.out.println("\n≣≣≣≣≣≣≣≣≣≣≣≣≣≣≣≣≣≣≣ Student Details ≣≣≣≣≣≣≣≣≣≣≣≣≣≣≣≣≣≣≣");
					System.out.println("\n⫸⫸⫸ Student Name : " + stud1.getstudentName());
					System.out.println("\n⫸⫸⫸ Student ID : " + stud1.studentId());
					System.out.println("\n⫸⫸⫸ Student Email : " + stud1.getstudentEmail());

					for (Course cors1 : stud1.corsList) {
						System.out.println("\n≣≣≣≣≣≣≣≣≣≣≣≣≣≣≣≣≣≣≣ Course Details ≣≣≣≣≣≣≣≣≣≣≣≣≣≣≣≣≣≣≣");
						System.out.println("\n⫸⫸⫸ Course ID : " + cors1.getcourseId());
						System.out.println("\n⫸⫸⫸ Course Name : " + cors1.getcourseName());
						System.out.println("\n≣≣≣≣≣≣≣≣≣≣≣≣≣≣≣≣≣≣≣ Marks Details ≣≣≣≣≣≣≣≣≣≣≣≣≣≣≣≣≣≣≣");
						System.out.println("\n⫸⫸⫸ Mathimatic Marks : " + cors1.mark.getmathMark());
						System.out.println("\n⫸⫸⫸ Information Technology Marks : " + cors1.mark.getitMark());
						System.out.println("\n⫸⫸⫸ English Language Marks : " + cors1.mark.getenglishMark());
						System.out.println("\n⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘");

					}
					
				}
			}
			System.out.println("\n program completed , Thank you!");
		}
		
		
		
			
			
			try {
				BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Lenovo\\eclipse-workspace\\school\\testschool.txt"));
				writer.write("School Reports...");
				
			for(String  stackoutput : inputtStack ) {
				System.out.println("\n⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘⌘");
				System.out.println(stackoutput);
				writer.write("\n" +stackoutput );
				
			}
				writer.close();
			
			
			} catch (IOException e) {
			
				e.printStackTrace();
			}
			
			try {
				BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Lenovo\\eclipse-workspace\\school\\testschool.txt"));
				String line;
				while (( line = reader.readLine()) != null)
				
				System.out.println(line);
			
			
				reader.close();
				
			
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
		}
				
	
	}
	
}



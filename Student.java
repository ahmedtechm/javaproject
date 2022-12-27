package school;

import java.util.ArrayList;
import java.util.Scanner;


public class Student {
	
	private String studentName;
	private int studentId;
	private String studentEmail;
	
	Scanner scan = new Scanner(System.in).useDelimiter("\n");
	Scanner scan1 = new Scanner(System.in);

	ArrayList<Course> corsList = new ArrayList<Course>();
	//Stack <String> inputtStack = new Stack<>();
	//Stack <Integer> inputtStak = new Stack<>();
	
	//This is a Constructor of Student
	/*Student (){
		System.out.println("Please Enter Student Name:");
		setstudentName(scan.next());
		inputtStack.push(studentName);
		
		System.out.println("Please Enter Student ID:");
		setstudentId(scan1.nextInt());
		inputtStak.push(studentId);
		
		System.out.println("Please Enter Student Email:");
		setstudentEmail(scan.next());
		inputtStack.push(studentEmail);
		
	}*/



	//Course course = new Course ();
	
	public String getstudentName() {
	    return studentName;
	  }

	public void setstudentName(String studentName) {
	    this.studentName = studentName;
	  }

	public int studentId() {
		    return studentId;
		  }

	public void setstudentId(int studentId) {
		    this.studentId = studentId;
		  }
	
	public String getstudentEmail() {
	    return studentEmail;
	  }

	  public void setstudentEmail(String studentEmail) {
	    this.studentEmail = studentEmail;
	  }
			  

	
	
	
	
	


}

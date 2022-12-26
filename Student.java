package school;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	
	private String studentName;
	private int studentId;
	private String studentAddress;
	private String studentEmail;
	
	Scanner scan = new Scanner(System.in).useDelimiter("\n");
	Scanner scan1 = new Scanner(System.in);

	ArrayList<Course> corsList = new ArrayList<Course>();
	
	Student (){
		System.out.println("Please Enter Student Name:");
		setstudentName(scan.next());
		System.out.println("Please Enter Student ID:");
		setstudentId(scan1.nextInt());
		System.out.println("Please Enter Student Email:");
		setstudentEmail(scan.next());
		
	}



	//Course course = new Course ();
	
	public String getstudentName() {
	    return studentName;
	  }

	public void setstudentName(String studentName) {
	    this.studentName = studentName;
	  }
	     /*===========done=============*/
	public int studentId() {
		    return studentId;
		  }

	public void setstudentId(int studentId) {
		    this.studentId = studentId;
		  }
	/*===========done=============*/ 
	public String getstudentAddress() {
			    return studentAddress;
			  }

	public void setstudentAddress(String studentAddress) {
			    this.studentAddress = studentAddress;
			  }
	
	 /*===========done=============*/
	
	public String getstudentEmail() {
	    return studentEmail;
	  }

	  public void setstudentEmail(String studentEmail) {
	    this.studentEmail = studentEmail;
	  }
			  
	  /*===========done=============*/
	
	
	
	
	


}

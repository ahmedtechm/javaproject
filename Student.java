package school;

import java.util.ArrayList;

public class Student {
	
	private String studentName;
	private int studentId;
	private String studentAddress;
	private String studentEmail;

	ArrayList<Course> corsList = new ArrayList<Course>();



	Course course = new Course ();
	
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

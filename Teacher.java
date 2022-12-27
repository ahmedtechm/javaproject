package school;

import java.util.ArrayList;
import java.util.Scanner;


public class Teacher {
	
	private String teacherName;
	private int teacherId;
	private String teacherEmail;
	
	Scanner scan = new Scanner(System.in).useDelimiter("\n");
	Scanner scan1 = new Scanner(System.in);
	
	ArrayList<Student> studList = new ArrayList<Student>();
	//Stack <String> inputtStack = new Stack<>();
	//Stack <Integer> inputtStak = new Stack<>();
	
	//This is a Constructor of Teacher
	/*Teacher() { 
		System.out.println("Please Enter Teacher Name:");
		setteacherName(scan.next());
		inputtStack.push(teacherName);
		System.out.println("Please Enter Teacher ID:");
		setteacherId(scan1.nextInt());
		inputtStak.push(teacherId);
		System.out.println("Please Enter Teacher Email:");
		setteacherEmail(scan.next());
		inputtStack.push(teacherEmail);
		
		
		
	}*/
		

	

//Student studobj = new Student ();
	
	
	
	public String getteacherName() {
	    return teacherName;
	  }

	public void setteacherName(String teacherName) {
	    this.teacherName = teacherName;
	  }
	    
	public int teacherId() {
		    return teacherId;
		  }

	public void setteacherId(int teacherId) {
		    this.teacherId = teacherId;
		  }
	
	
	

	public String getteacherEmail() {
	    return  teacherEmail;
	  }

	  public void setteacherEmail(String  teacherEmail) {
	    this. teacherEmail =  teacherEmail;
	  }
			  
	 
	


}

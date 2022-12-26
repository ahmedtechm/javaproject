package school;

import java.util.Scanner;

public class Course {
	
	private int courseId;
	private String courseName;
	
	Scanner scan = new Scanner(System.in).useDelimiter("\n");
	Scanner scan1 = new Scanner(System.in);
	
	
	
	Mark mark = new Mark();
	
	Course(){
		System.out.println("Please Enter Course ID:");
		setcourseId(scan1.nextInt());
		System.out.println("Please Enter Course Name:");
		setcourseName(scan.next());
		
		
	}
	
	public int getcourseId() {
	    return courseId;
	  }

	public void setcourseId(int courseId) {
	    this.courseId = courseId;
	  }
	     /*===========done=============*/
	public String getcourseName() {
		    return courseName;
		  }

	public void setcourseName(String courseName) {
		    this.courseName = courseName;
		  }
		  /*===========done=============*/ 

}

package school;

import java.util.Scanner;


public class Course {
	
	private int courseId;
	private String courseName;
	
	Scanner scan = new Scanner(System.in).useDelimiter("\n");
	Scanner scan1 = new Scanner(System.in);
	
	//Stack <String> inputtStack = new Stack<>();
	//Stack <Integer> inputtStak = new Stack<>();
	
	
	
	Mark mark = new Mark();
	
	//This is a Constructor of Course
	/*Course(){
		System.out.println("Please Enter Course ID:");
		setcourseId(scan1.nextInt());
		inputtStak.push(courseId);
		System.out.println("Please Enter Course Name:");
		setcourseName(scan.next());	
		}*/
	
	
	public int getcourseId() {
	    return courseId;
	    }
	public void setcourseId(int courseId) {
	    this.courseId = courseId;
	  	}
	    
	
	
	public String getcourseName() {
		    return courseName;
			}
	public void setcourseName(String courseName) {
		    this.courseName = courseName;
		  	}

}

package school;

import java.util.ArrayList;

public class Teacher {
	
	private String teacherName;
	private int teacherId;
	private String teacherEmail;
	
	ArrayList<Student> studList = new ArrayList<Student>();

	

Student studobj = new Student ();
	
	
	
	public String getteacherName() {
	    return teacherName;
	  }

	public void setteacherName(String teacherName) {
	    this.teacherName = teacherName;
	  }
	     /*===========done=============*/
	public int teacherId() {
		    return teacherId;
		  }

	public void setteacherId(int teacherId) {
		    this.teacherId = teacherId;
		  }
	
	/*===========done=============*/
	

	public String getteacherEmail() {
	    return  teacherEmail;
	  }

	  public void setteacherEmail(String  teacherEmail) {
	    this. teacherEmail =  teacherEmail;
	  }
			  
	  /*===========done=============*/
	


}

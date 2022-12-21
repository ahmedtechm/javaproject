package school;

import java.util.ArrayList;

public class School {

	private String schoolName;
	private String schoolType;
	private String schoolAddress;

	ArrayList<Department> depList = new ArrayList<Department>();
	


	Department depObj = new Department();
	
	public String getschoolName() {
	    return schoolName;
	  }

	public void setschoolName(String schoolName) {
	    this.schoolName = schoolName;
	  }
	     /*===========done=============*/
	public String getschoolType() {
		    return schoolType;
		  }

	public void setschoolType(String schoolType) {
		    this.schoolType = schoolType;
		  }
		  /*===========done=============*/ 
	public String getschoolAddress() {
			    return schoolAddress;
			  }

			  public void setschoolAddress(String schoolAddress) {
			    this.schoolAddress = schoolAddress;
			  }
	
			  /*===========done=============*/
	
	
	
	
	
	
	
	
	

	
	
}

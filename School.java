package school;

import java.util.ArrayList;
import java.util.Scanner;


public class School {

	private String schoolName;
	private String schoolType;
	private String schoolAddress;
	
	
	Scanner scan = new Scanner(System.in).useDelimiter("\n");
	Scanner scan1 = new Scanner(System.in);

	ArrayList<Department> depList = new ArrayList<Department>();
	
	//Stack <String> inputtStack = new Stack<>();
	
	//This is a Constructor of School
	/*School (){
		System.out.println("\nPlease Enter School Name:");
		setschoolName(scan.next());
		inputtStack.push(schoolName);
		System.out.println("Please Enter School Type:");
		setschoolType(scan.next());
		inputtStack.push(schoolType);
		System.out.println("Please Enter School Address:");
		setschoolAddress(scan.next());
		inputtStack.push(schoolAddress);
	}*/


	//Department depObj = new Department();
	
	public String getschoolName() {
	    return schoolName;
	  }

	public void setschoolName(String schoolName) {
	    this.schoolName = schoolName;
	  }
	     
	public String getschoolType() {
		    return schoolType;
		  }

	public void setschoolType(String schoolType) {
		    this.schoolType = schoolType;
		  }
		 
	public String getschoolAddress() {
			    return schoolAddress;
			  }

			  public void setschoolAddress(String schoolAddress) {
			    this.schoolAddress = schoolAddress;
			  }
	
	
	
	
	
	
	
	
	
	

	
	
}

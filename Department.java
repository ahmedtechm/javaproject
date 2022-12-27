package school;

import java.util.ArrayList;
import java.util.Scanner;

public class Department {

	private String departmentName;
	private int noOfFloors;
	Scanner scan = new Scanner(System.in).useDelimiter("\n");
	Scanner scan1 = new Scanner(System.in);
	
	ArrayList<Teacher> teacherList = new ArrayList<Teacher>();
	//Stack <String> inputtStack = new Stack<>();
	//Stack <Integer> inputtStak = new Stack<>();
	
	
	//This is a Constructor of Department
	/*Department(){
		System.out.println("Please Enter Department Name:");
	    setdepartmentName(scan.next());
	    inputtStack.push(departmentName);
		System.out.println("Please Enter Department Floor:");
		setnoOfFloors(scan1.nextInt());
		inputtStak.push(noOfFloors);
	}*/

	//Teacher teachobj = new Teacher();

	public String getdepartmentName() {
		return departmentName;
	}

	public void setdepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	
	public int getnoOfFloors() {
		return noOfFloors;
	}

	public void setnoOfFloors(int noOfFloors) {
		this.noOfFloors = noOfFloors;
	}



}

package school;

import java.util.ArrayList;
import java.util.Scanner;

public class Department {

	private String departmentName;
	private int noOfFloors;
	Scanner scan = new Scanner(System.in).useDelimiter("\n");
	Scanner scan1 = new Scanner(System.in);
	
	ArrayList<Teacher> teacherList = new ArrayList<Teacher>();
	
	Department(){
		System.out.println("Please Enter Department Name:");
	    setdepartmentName(scan.next());
		System.out.println("Please Enter Department Floor:");
		setnoOfFloors(scan1.nextInt());
	}

	//Teacher teachobj = new Teacher();

	public String getdepartmentName() {
		return departmentName;
	}

	public void setdepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	/* ===========done============= */
	public int getnoOfFloors() {
		return noOfFloors;
	}

	public void setnoOfFloors(int noOfFloors) {
		this.noOfFloors = noOfFloors;
	}

	/* ===========done============= */

}

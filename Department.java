package school;

import java.util.ArrayList;

public class Department {

	private String departmentName;
	private int noOfFloors;
    
	ArrayList<Teacher> teacherList = new ArrayList<Teacher>();



	Teacher teachobj = new Teacher();

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

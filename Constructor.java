package school;

public class Constructor {
	
	String studentName;
	int studentAge;
	public Constructor ( String name, int age) {
	    studentName = name;
	    studentAge = age;
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Constructor myobj = new Constructor("Ahmed" , 27);
		System.out.println(myobj.studentName + "\n" + myobj.studentAge);

	}

}

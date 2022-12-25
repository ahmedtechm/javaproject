package school;

public class Constructor {
	
	String studentName;
	String familyName;
	int studentAge;
	
	
	public Constructor ( String name,String fname, int age) {
	    studentName = name;
	    familyName = fname;
	    studentAge = age;
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// call the constructor
		Constructor myobj = new Constructor("Ahmed" , "ALAbri",26);
		System.out.println(myobj.studentName + "\n" + myobj.familyName+"\n "+myobj.studentAge);

		

	}

}

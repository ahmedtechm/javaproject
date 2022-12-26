package school;

import java.util.Scanner;

public class Mark {
	
	private int mathMark;
	private int itMark;
	private int englishMark;
	
	Scanner scan = new Scanner(System.in).useDelimiter("\n");
	Scanner scan1 = new Scanner(System.in);
	
	
	
	Mark(){
		System.out.println("Please Enter Mathimatic Marks:");
		setmathMark(scan1.nextInt());
		System.out.println("Please Enter Information Technology Marks:");
		setitMark(scan1.nextInt());
		System.out.println("Please Enter English Language Marks:");
		setenglishMark(scan1.nextInt());
		
		
	}
	
	
	
	public int getmathMark() {
	    return mathMark;
	  }

	public void setmathMark(int mathMark) {
	    this.mathMark = mathMark;
	  }
	     /*===========done=============*/
	public int getitMark() {
		    return itMark;
		  }

	public void setitMark(int itMark) {
		    this.itMark = itMark;
		  }
		  /*===========done=============*/ 
	public int getenglishMark() {
			    return englishMark;
			  }

			  public void setenglishMark(int englishMark) {
			    this.englishMark = englishMark;
			  }
	
			  /*===========done=============*/

}

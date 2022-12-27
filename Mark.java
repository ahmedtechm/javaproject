package school;

import java.util.Scanner;


public class Mark {
	
	private int mathMark;
	private int itMark;
	private int englishMark;
	
	Scanner scan = new Scanner(System.in).useDelimiter("\n");
	Scanner scan1 = new Scanner(System.in);
	
	//Stack <Integer> inputtStak = new Stack<>();
	
	
	//This is a Constructor of Mark
	/*Mark(){
		System.out.println("Please Enter Mathimatic Marks:");
		setmathMark(scan1.nextInt());
		inputtStak.push(mathMark);
		System.out.println("Please Enter Information Technology Marks:");
		setitMark(scan1.nextInt());
		inputtStak.push(itMark);
		System.out.println("Please Enter English Language Marks:");
		setenglishMark(scan1.nextInt());
		inputtStak.push(englishMark);
		
	}*/
	
	
	
	public int getmathMark() {
	    return mathMark;
	  }

	public void setmathMark(int mathMark) {
	    this.mathMark = mathMark;
	  }
	     
	public int getitMark() {
		    return itMark;
		  }

	public void setitMark(int itMark) {
		    this.itMark = itMark;
		  }
		
	public int getenglishMark() {
			    return englishMark;
			  }

			  public void setenglishMark(int englishMark) {
			    this.englishMark = englishMark;
			  }
	

}

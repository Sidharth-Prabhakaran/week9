package week9;

import java.util.Scanner;

public class FinalExam extends GradedActivity{
	private int nq;
	private double pointsEach;
	private int missed;
	
	
	public FinalExam() {
		
	}

	public FinalExam(int nq, int missed) {
		super();
		this.nq = nq;
		this.missed = missed;
		pointsEach = 100.0 / nq;
		
		double score = 100 - (missed*pointsEach);
		setScore(score);
	}

	public void Display() {
		

		/* int nq = 0;
		int missed= 0;
		Scanner in = new Scanner(System.in);
		System.out.println("enter the num of ques : ");
		nq = in.nextInt();
		System.out.println("enter the num of ques missed : ");
		missed = in.nextInt(); */
		
//		System.out.println("Score is : " + getScore() + "\nGrade is : " + getGrade());
		System.out.println("this is child");
	}
	
	public void Displayclass() {
		super.Display();
	}


	public static void main(String[] args) {
		
		FinalExam f = new FinalExam();
		f.Displayclass();
				

	}

}

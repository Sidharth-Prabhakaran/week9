package week9;

public class GradedActivity {
	private double score;

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}
	
	public char getGrade() {
		char g;
		if (score >= 90) {
			g = 'A';
			
		}else if(score <90 && score >=70) {
			g = 'B';
			
		}else {
			g= 'C';
		}
		return g;
	}
	
public void Display() {
		
		System.out.println("this is Parent Display");
	}

}

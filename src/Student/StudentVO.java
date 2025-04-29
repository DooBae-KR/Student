package Student;

public class StudentVO {

	private String name;
	private int korScore;
	private int engScore;
	private int mathScore;

	public String getName() {
		return name;
	}

	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}

	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}

	public int getKorScore() {
		return korScore;
	}
	
	   public int getMathScore() {
		      return mathScore;
		   }


		   public int getEngScore() {
		      return engScore;
		   }


		   public void setName(String name) {
		      this.name = name;
		   }
}
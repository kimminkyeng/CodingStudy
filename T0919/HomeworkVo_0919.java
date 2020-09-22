package T0919;

public class HomeworkVo_0919 {
	private String name;
	private int kor;
	private int eng;
	private int met;
	
	public HomeworkVo_0919 () {}
	
	public HomeworkVo_0919(String name, int kor, int eng, int met) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.met = met;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMet() {
		return met;
	}

	public void setMet(int met) {
		this.met = met;
	}

	@Override
	public String toString() {
		return "HomeworkVo_0919 [name=" + name + ", kor=" + kor + ", eng=" + eng + ", met=" + met + "]";
	}
	
}


package T0919;

public class HomeworkCal_0919 {
	public int total(int kor, int eng, int met) {
		int tot = kor + eng + met;
		return tot;
	}
	
	public double average (int tot) {
		double avg = (double)tot/3;
		return avg;
	}
	
	public String hakjum (double avg) {
		String hak;
		
		if(avg>=90 && avg<101) {
			hak = "A";
		}
		else if(avg>=80 && avg<90) {
			hak = "B";
		}
		else if(avg>=70 && avg<80) {
			hak = "C";
		}
		else if(avg>=60 && avg<70) {
			hak = "D";
		}
		else {
		    hak = "F";	
		}
		return hak;
	}
}

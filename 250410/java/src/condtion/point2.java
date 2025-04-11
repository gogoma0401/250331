package condtion;

public class point2 {
	public static void main(String[] args) {
		int java = 88;
		int db = 99;
		int math = 73;
		int tot = java + db + math;
		double avg = tot / 3.0;
		String grade;
		if(avg >= 90 && avg <= 100) {
			grade = "A";
		}else if(avg >= 80 && avg < 90) {
			grade = "B";
		}else if(avg >= 70 && avg < 80) {
			grade = "D";
		}else if(avg >= 70 && avg < 80) {
			grade = "F";
		}
		System.out.println("Java:" + java);
		System.out.println("DB:" + db);
		System.out.println("Math:" + math);
		System.out.println("avg" + String.format("%5.2f", avg));
		
	}
}

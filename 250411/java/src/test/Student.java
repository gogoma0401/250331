package test;

public class Student {
	String name;
	int grade =1;
	
	Student(String name){
		this.name = name;
	}
	
	Student(String name, int grade){
		this.name = name;
		this.grade = grade;
	}
	void introduce() {
		if(grade >= 1 && grade <= 3) {
			System.out.println("저는" + grade + "학년" + name + "입니다.");
		}else {
			System.out.println("저는" + name + "입니다.");
		}
	}
		
	public static void main(String[] args) {
		Student s1 = new Student("철수");
		Student s2 = new Student("짱구",5);
		s1.introduce();
		s2.introduce();
	}
}



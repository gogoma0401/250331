package test;

public class Person {
	String name;
	int age = -1;
	
	Person(String name){
		this.name = name;
	}
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	public static void main(String[] args) {
		Person p1 = new Person("민수");
		Person p2 = new Person("철수", 25);
		System.out.println(p1.name);
		System.out.println(p2.name + p2.age);
	}
}

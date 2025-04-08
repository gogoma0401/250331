package opp;

public class Person2 {
	public String name;
	public int age;
	public double height;
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void getHeight() {
		return height;
	}
	public void setAge(int age) {
		if (age < 0 || age > 150) {
			System.out.println("error!");
		} else {
			this.age = age;
		}
	}
	public String getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void print() {
		System.out.println("Name : " + name + ",Age:" + age + ",Height:" + height); 
	}
}

package test;
class Animal{
	String name;
	public void setName(String name) {
		this.name = name;
	}
}
public class Sample {
	public static void main(String[] args) {
		Animal cat = new Animal();
		cat.setName("body");
		System.out.println(cat.name);
	}
}

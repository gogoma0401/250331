package test;

abstract class Shape{
	String color;
	public void setColor(String color) {
		this.color = color;
	}
	public abstract double calculateArea();
	
}
class Circle extends Shape {
	double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		return Math.PI * radius * radius;
	}	
}

class Rectangle extends Shape{
	double width;
	double height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double calculateArea() {
		return width * height;
	}
	
}

public class AbstractExample {
	public static void main(String[] args) {
		Shape circle = new Circle(5);
		Shape rectangle = new Rectangle(10, 20);
		
		circle.setColor("Red");
		rectangle.setColor("Blue");
		
		System.out.println("원의 넓이 : " + circle.calculateArea());
		System.out.println("사각형의 넓이 : " + rectangle.calculateArea());
	}
	
	
}

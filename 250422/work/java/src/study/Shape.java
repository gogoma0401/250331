package study;

public class Shape {
    // 넓이를 계산해서 double 타입으로 반환하는 메서드를 정의합니다.
	
    public double calculateArea() {
        return 0.0;
    }
}
class Circle extends Shape {
	double radius;
	public Circle(double radius) {
		this.radius = radius;
	}
	@Override
	public double calculateArea() {
		return (radius*radius*Math.PI);
	}
	
}

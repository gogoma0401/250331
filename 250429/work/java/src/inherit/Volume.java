package inherit;

public class Volume extends Area{
	private int height;
	public Volume() {}
	public Volume(int width, int length, int hegiht) {
		super(width, length);
		this.height = height;
	}
	public int getVolume() {
		return getArea() * height;
	}
}

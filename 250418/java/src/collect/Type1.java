package collect;

public class Type1 {
	int value;

	public int getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
	public static void main(String[] args) {
		Type2 t = new Type2();
		t.setValue("kim");
		System.out.println(t.getValue());
		t.setValue(100.5);
		System.out.println();
	}
}


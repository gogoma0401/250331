package collect;

public class Type1 {
	int value;

	public int getType1() {
		return value;
	}
	public void setType1(int value) {
		this.value = value;
	}
	
	public static void main(String[] args) {
		Type1 t = new Type1();
		t.setType1(100);
		
		System.out.println(t.getType1());
	}
	
}


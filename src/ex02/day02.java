package ex02;
class Father{
	String blood;
}

class child extends Father{
	void use() {
		Father fa = new Father();
		String s = fa.blood;
	}
}

class Over{
	void use() {
		System.out.println("부모입니다");
	}
}


public class day02 extends Over {
	public static void main(String[] args) {
		day02 d2 = new day02();
		d2.use();
	}
	@Override
	void use() {
		// super.use();
		System.out.println("자식입니다.");
	}
}

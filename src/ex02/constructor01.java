package ex02;

public class constructor01 {
	public static void main(String[] args) {
		cstTest01 ct = new cstTest01("고길동", "01012345678");
		ct.use();
	}
}
class cstTest01{
	String name;
	String number;
	public cstTest01(String name, String number) {
		this.name = name;
		this.number = number;
	}
	void use() {
		System.out.println("내 이름은 " + name + " 전화번호는 " + number);
	}
}

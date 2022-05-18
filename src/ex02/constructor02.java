package ex02;
/* 생성자 오버로딩 */
public class constructor02 {
	public static void main(String[] args) {
		
		CstTest02 ct1 = new CstTest02();
		ct1.use();
		// 아무것도 존재하지 않는 생성자 호출
		CstTest02 ct2 = new CstTest02("고길동");
		ct2.use();
		// String name이 있는 생성자 호출, money는 기본 설정인 100이 출력
		CstTest02 ct3 = new CstTest02(5000000);
		ct3.use();
		// int money만 있는 생성자 호출, name은 기본 설정인 아무개 출력
		CstTest02 ct4 = new CstTest02("둘리",10000000);
		ct4.use();
		// String name, int money가 있는 생성자 호출
		
	}
}
class CstTest02{
	
	String name = "아무개";
	int money = 100;
	public CstTest02() {
		this.name = "빈생성자";
		this.money = 0;
	}
	public CstTest02(String name) {
		this.name = name;
	}
	public CstTest02(int money) {
		this.money = money;
	}
	public CstTest02(String name,int money) {
		this.name = name;
		this.money = money;
	}
	void use() {
		System.out.println("이름 : " + name + "\n 가진돈 : " + money );
	}
}

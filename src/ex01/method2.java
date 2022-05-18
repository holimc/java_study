package ex01;

public class method2 {
	public static void main(String[] args) {
		method2 mt = new method2();
		mt.morning();
		System.out.println("학교를 갔다가");
		System.out.println("집에 돌아오면");
		mt.morning();
		
	}
	
	public void morning() {
		System.out.println("발씻고");
		System.out.println("손씻고");
		System.out.println("머리감고");
		System.out.println("이닦고");
	}
}

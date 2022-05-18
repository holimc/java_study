package ex02;
// private 접근 제어자를 이용해, 특정 변수의 정보를 얻어오거나, 얻어오지 못하게 할수 있다.

public class AccessControlTest01 {
	public static void main(String[] args) {
		privateTest01 pt = new privateTest01();
		String id = pt.getId("또치");
		System.out.println("아이디 : " + id );
		
		String id2 = pt.getId("도우너");
		System.out.println("아이디 : " + id2);
		
		
		
	}
}
class privateTest01{
	String id;
	String key;
	
	private void myIdPw() {
		String pw;
		this.id = "ddochi";
		pw = "13579";
		if(key=="또치") {
			System.out.println("비밀번호 : " + pw);
		}else {
			System.out.println(id+"에 맞는 정보가 아닙니다.");
		}
	}
	public String getId(String key) {
		this.key = key;
		myIdPw();
		return id;
	}
}

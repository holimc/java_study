package ex09;

public class GenericClassTesterEx01 {
	static class GenericClass<T>{
		// 제네릭 클래스의 파라미터를 T라고 작성
		private T xyz;
		GenericClass(T t){
			this.xyz = t;
		}
		//생성자
		T getXyz() {
			return xyz;
		}
		//getter을 통해 xyz반환
		
	}
	public static void main(String[] args) {
		GenericClass<String> s = new GenericClass<String>("ABC");
		GenericClass<Integer> n = new GenericClass<Integer>(15);
		// T에 입력하는 ㅍ자료형에 따라 String을 넘기기도하고, Integer를 넘기기도 할수있다.
		
		System.out.println(s.getXyz());
		System.out.println(n.getXyz());
	}
}

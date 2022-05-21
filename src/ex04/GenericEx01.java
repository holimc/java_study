package ex04;

class Box<T>{
	private T t;
	public void set(T t) {
		this.t = t;
	}
	public T get() {
		return t;
	}
}

public class GenericEx01 {
	public static void main(String[] args) {
		Box<Integer> integerBox = new Box<Integer>();
		Box<String> stringBox =  new Box<String>();
		integerBox.set(333);
		stringBox.set("hello world");
		
		System.out.println(integerBox.get());
		System.out.println(stringBox.get());
		
	}

}

package ex03;
class Outer01{
	int i = 22;
	void p() {
		System.out.println("i = " + i);
	}
	class Inner01{
		int j = 23;
		void m() {
			System.out.println("i + j = " + (i+j));
			p();
		}
	}
}

public class InnerClass {
	public static void main(String[] args) {
		Outer01	ot = new Outer01();
		Outer01.Inner01 in = ot.new Inner01();
		in.m();
		ot.p();
	}

}

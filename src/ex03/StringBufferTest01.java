package ex03;

public class StringBufferTest01 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("java");
		System.out.println(sb);
		sb.append(" programming");
		System.out.println(sb);
		
		sb.replace(0, 4, "android");
		System.out.println(sb);
		sb.deleteCharAt(0);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}

}

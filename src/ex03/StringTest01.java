package ex03;

public class StringTest01 {
	public static void main(String[] args) {
		String s1 = "Java Programming";
		int leng = s1.length();
		System.out.println("s1의 길이 : " + leng);
		System.out.println("대문자 : " + s1.toUpperCase());
		System.out.println("소문자 : " + s1.toLowerCase());
		String s2 = s1.substring(5);
		char c1 = s1.charAt(8);
		System.out.println("5번재 자리 이후 문자열 : " + s2);
		System.out.println("8번째 자리의 문자 : " + c1);
		int idx1 = s1.indexOf('a');
		System.out.println("a의 첫번째 자리값 : " + idx1);
		int idx2 = s1.lastIndexOf('a');
		System.out.println("a의 마지막 자리값 : " + idx2);
		String s3 = s1.replace('a','q');
		System.out.println("a를 q로 바꾼 문자열 : " + s3);
		String s4 = "Java&JSP&Android&Spring";
		String s5[] = s4.split("&");
		for(int i =0; i<s5.length; i++) {
			System.out.println("s5["+i+"] : " + s5[i]);
		}
		String s6 = "    JSPStudy        ";
		System.out.println("*"+s6.trim()+"*");
		
		int idx3 = 22;
		int idx4 = 22;
		String s7 = String.valueOf(idx3) + String.valueOf(idx4);
		System.out.println("정수를 문자열로 바꿔서 합친 값 : " + s7);
		
	}
}

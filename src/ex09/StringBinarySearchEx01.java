package ex09;

import java.util.Arrays;
import java.util.Scanner;

public class StringBinarySearchEx01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] x = {
				"abstract", "assert", "boolean", "break", "byte",
				"case", "catch", "char", "class", "const",
				"continue", "default", "do", "double", "else",
				"enum", "extends", "final", "finally", "float",
				"for", "goto", "if", "implements", "import",
				"instanceof", "int", "ifterface", "long", "native",
				"new", "package", "private", "protected", "public",
				"return", "short", "static", "strictfp", "super",
				"switch", "synchronized", "this", "throw", "throws",
				"transient", "try", "void", "volatile", "while"
		};
		System.out.print("원하는 키워드를 입력하세요 : ");
		String ky = sc.next();
		
		int idx = Arrays.binarySearch(x, ky);
		if(idx<0) {
			System.out.println("그 값의 요소는 없습니다.");
		}else {
			System.out.println(ky + "는 x["+idx+"]에 있습니다.");
		}
		
	}
}

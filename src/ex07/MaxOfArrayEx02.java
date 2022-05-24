package ex07;
//Ex01과 다르게 랜덤을 이용한 난수로 요소값을 넣는다.

// Q3. 사람 수도 랜덤으로 받아서 실행하도록 해본다.

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayEx02 {
	static int maxOf(int[] a) {
		int max = a[0];
		
		for(int i=1; i<a.length; i++) {
			if(a[i]>max) {
				max = a[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		Random rand = new Random();
		int num = 0;
		
		System.out.println("키의 최대값을 구합니다");
		do {
			num = rand.nextInt(40);
			
		}while(num<10 || num>40);
		System.out.println("사람 수 : " + num);
		
		int[] height = new int[num];
		
		for(int i=0; i<height.length; i++) {
			height[i] = 100+rand.nextInt(90);
			System.out.println(i+1 +"번째 사람의 키 : " + height[i]);
		}
		System.out.println("제일 키가 큰 사람의 키는 " + maxOf(height) + "입니다.");
	}
}

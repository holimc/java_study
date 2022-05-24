package ex07;

import java.util.Random;

// Q1. 배열 요소를 역순으로 정렬하는 과정을 하나하나 나타내는 프로그램을 작성하시오
// Q2. 배열 a의 모든 요소의 합계를 구하여 반환하는 메서드를 작성하시오.
public class TestEx01 {
	static void swap(int[] arr, int idx1, int idx2){
		int t = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = t;
		System.out.println("arr["+idx1+"]의 값과 arr["+idx2+"]의 값을 교환했습니다.");
	}
	static void arrPrint(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
	static void reverseArr(int[] arr) {
		for(int i=0; i<(arr.length/2); i++) {
			swap(arr, i, arr.length-i-1);
			arrPrint(arr);
		}
	}
	
	static void createArr(int[] arr) {
		Random rand = new Random();
		for(int i=0; i<arr.length; i++) {
			arr[i] = rand.nextInt(100);
		}
	}
	
	static void sumArr(int[] arr) {
		int answer = 0;
		for(int i=0; i<arr.length; i++) {
			answer += arr[i];
		}
		System.out.println("배열의 모든 요소의 합은 "+answer+"입니다.");
	}
	
	public static void main(String[] args) {
		int[] arr = new int[10];
		
		createArr(arr);
		reverseArr(arr);
		sumArr(arr);
	}
}

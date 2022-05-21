package ex04;

import java.util.ArrayList;

public class ArrayListEx01 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("강원도 주문진");
		list.add("경기도 포천");
		list.add("충북 제천");
		for(int i=0;i<list.size();i++) {
			System.out.println(i +"번지의 값 : " + list.get(i));
		}
		list.remove(0);
		System.out.println("2차 테스트");
		for(int i=0;i<list.size();i++) {
			System.out.println(i +"번지의 값 : " + list.get(i));
		}
	}
}

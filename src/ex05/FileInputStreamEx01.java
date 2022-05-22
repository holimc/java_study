package ex05;

import java.io.FileInputStream;

public class FileInputStreamEx01 {
	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("./abc.txt");
			int value = 0;
			
			while((value = fin.read()) != -1) {
				System.out.println((char)value);
			}
		}catch (Exception e) {
			System.out.println(e);
		}
	}
}

package ex05;

import java.io.FileOutputStream;

public class FileOutputStreamEx01 {
	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("./abc.txt");
			String str = "Java Programming File I/O";
			byte values[] = str.getBytes();
			fout.write(values);
			fout.close();
			System.out.println("작성완료");
		}catch (Exception e) {
			System.out.println(e);
		}
	}
}

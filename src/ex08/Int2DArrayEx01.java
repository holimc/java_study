package ex08;

public class Int2DArrayEx01 {
	public static void main(String[] args) {
		int[][] x = new int[2][4];
		
		x[0][1] = 37;
		x[0][3] = 54;
		x[1][2] = 65;
		
		for(int i=0; i<x.length; i++) {
			for(int j=0; j<x[i].length; j++) {
				System.out.println("배열 x["+i+"]["+j+"]의 값 : " + x[i][j]);
			}
		}
	}
}

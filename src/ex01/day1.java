package ex01;


public class day1 {
	
	String hand;
	String leg;
	String head;
	String eyes;
	String runSpeed;
	String hasWeapon;
	String height;
	public static void main(String[] args) {
		/*
		 * String name;
		
		name = "java";
		String yourName = "python";
		
		System.out.println("지금 하는거"+name);
		System.out.println("지금 안하는거"+yourName);
		*/
		day1 character = new day1();
		character.hand = "크다";
		character.leg = "길다";
		character.head = "크다";
		character.eyes = "크다";
		character.runSpeed ="빠르다";
		character. hasWeapon ="권총";
		character.height ="크다";
		
		System.out.println("손은 "+ character.hand +"\n");
	}
}

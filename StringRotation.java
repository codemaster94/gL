package gayleLakmann;

import java.util.Scanner;

public class StringRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		System.out.println(isRotation(s1,s2));
		sc.close();
	}
	static boolean isRotation(String s1, String s2) {
		if(s1.length() == s2.length() || s1.length() > 0) {
			String s1s1 = s1 + s1;
			return s1s1.indexOf(s2) != -1;
		}
		return false;
	}

}

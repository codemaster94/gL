package gayleLakmann;

import java.util.Arrays;
import java.util.Scanner;

public class IsUnique {

	final static int MAX_CHAR = 256;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StringBuilder str = new StringBuilder();
		str.append(sc.nextLine());
		System.out.println(uniqueCharacters(str) == true?"no duplicate characters":"duplicate characters found");
		sc.close();
	}
	private static boolean uniqueCharacters(StringBuilder str) {
		if(str.length() > MAX_CHAR)
			return false;
		boolean chars[] = new boolean[256];
		Arrays.fill(chars, false);
		for(int i = 0; i < str.length(); i++) {
			int index = str.charAt(i);
			if(chars[index] == true)
				return false;
			chars[index] = true;
		}
		return true;
	}

}

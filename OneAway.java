package gayleLakmann;

import java.util.Scanner;

public class OneAway {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		boolean result1 = oneEditAway(s1,s2);
		//boolean result2 = oneEditInsert(s1,s2);
		System.out.println("Away = "+result1);
		sc.close();
	}
	private static boolean oneEditAway(String s1, String s2) {
		if(s1.length() == s2.length())
			return oneEditReplace(s1,s2);
		else if(s1.length() + 1 == s2.length())
			return oneEditInsert(s1,s2);
		else if(s1.length() - 1 == s2.length())
			return oneEditInsert(s2,s1);
		else
			return false;
	}
	private static boolean oneEditReplace(String s1, String s2) {
		boolean foundDifference = false;
		for(int i = 0; i < s1.length(); i++) {
			if(s1.charAt(i) != s2.charAt(i)) {
				if(foundDifference)
					return false;
				else
					foundDifference = true;
			}
		}
		return true;
	}
	private static boolean oneEditInsert(String s1, String s2) {
		int index1 = 0;
		int index2 = 0;
		while(index2 < s2.length() && index1 < s1.length()) {
			if(s1.charAt(index1) != s2.charAt(index2)) {
				if(index1 != index2) {
					return false;
				}
				index2++;
			}
			else {
				index1++;
				index2++;
			}
		}
		return true;
	}
}

package gayleLakmann;

import java.util.Scanner;

public class PalindromePermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StringBuilder s = new StringBuilder();
		s.append(sc.nextLine());
		System.out.println(isPermutationOfPalindrome(s.toString()) == true?"correct":"no");
		sc.close();
	}
	private static boolean isPermutationOfPalindrome(String sc) {
		int table[] = buildFreqCharTable(sc);
		return isMaxOnOdd(table);
	}
	private static boolean isMaxOnOdd(int[] table) {
		boolean foundOdd = false;
		for(int count:table) {
			if(count % 2 == 1) {
				if(foundOdd)
					return false;
				foundOdd = true;
			}
			
		}
		return true;
	}
	private static int[] buildFreqCharTable(String sc) {
		int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
		for(char c: sc.toCharArray()) {
			int x = getCharNumber(c);
			if(x != -1) {
				table[x]++;
			}
		}
		return table;
	}
	private static int getCharNumber(Character c) {
		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');
		int value = Character.getNumericValue(c);
		if(a <= value && value <= z)
			return value - a;
		return -1;
	}

}

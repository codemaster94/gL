package gayleLakmann;

//import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		/*char x[] = s1.toCharArray();
		char y[] = s2.toCharArray();
		Arrays.sort(x);
		Arrays.sort(y);
		if(Arrays.equals(x, y))
			System.out.println("String are permuted");
		else
			System.out.println("not permuted");*/
		System.out.println(compare(s1,s2) == true?"permuted":"non permuted");
		sc.close();
	}
	public static HashMap<Character, Integer> getfrequency(String s1) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			int freq;
			if(map.containsKey(c))
				freq = map.get(c);
			else
				freq = 0;
			map.put(c, freq+1);
		}
		return map;
	}
	private static boolean compare(String s1, String s2) {
		if(s1.length() != s2.length()) {
			return false;
		}
		HashMap<Character, Integer> map1 = getfrequency(s1);
		HashMap<Character, Integer> map2 = getfrequency(s2);
		
		for(Character c: map1.keySet()) {
			if(map2.get(c) != map1.get(c))
				return false;
		}
		return true;
	}
	/*private static boolean isPermutation(String s1, String s2) {
		char s[] = s1.toCharArray();
		int letter[] = new int[256];
		for(char c: s) {
			letter[c]++;
		}
		for(int i = 0; i < s2.length(); i++) {
			int c = s2.charAt(i);
			letter[c]--;
			if(letter[c] < 0)
				return false;
		}
		return true;
	}*/
	/*private static boolean isPermutation(String s1, String s2) {
		int freq1[] = new int[256];
		int freq2[] = new int[256];
		for(int i = 0; i < s1.length(); i++) {
			int c1 = s1.charAt(i);
			int c2 = s2.charAt(i);
			++freq1[c1];
			++freq2[c2];
		}
		for(int i = 0; i < s1.length(); i++) {
			if(freq1[i] != freq2[i]) {
				return false;
			}
		}
		return true;
	}*/
}

package gayleLakmann;

import java.util.Scanner;

public class StringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StringBuilder s = new StringBuilder();
		String str = sc.nextLine();
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			count++;
			if(i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
				s.append(str.charAt(i));
				s.append(count);
				count = 0;
			}
		}
		System.out.println(s.length() < str.length()?s.toString():str);
		sc.close();
	}

}

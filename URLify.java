package gayleLakmann;

import java.util.Scanner;

public class URLify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StringBuilder s = new StringBuilder();
		s.append(sc.nextLine()).toString();
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == ' ') {
				s.replace(i, i+1, "%20");
			}
		}
		System.out.println(s);
		sc.close();
	}

}

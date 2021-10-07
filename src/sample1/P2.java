package sample1;

import java.util.HashSet;

public class P2 {

	public static void main(String[] args) {
		String s = "karmaa";
		HashSet<Character> set = new HashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		for (char ch : set) {
			int count=0;
			for (int i = 0; i < s.length(); i++) {
				
				if (ch == s.charAt(i)) {
					count++;
				}
			}
			if (ch == 1) {
				System.out.println(ch);
			}
		}

	}

}

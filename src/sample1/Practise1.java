package sample1;

import java.util.Scanner;

public class Practise1 {

	public static void main(String[] args) {
	String s="kapoor";
	String rev="";
	char[] ch=s.toCharArray();
	int count=0;
	for(char c:ch) {
		count++;
	}
		for(int i=count-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		
		}

		System.out.println("reverse string is");
		System.out.println(rev);

	}
}
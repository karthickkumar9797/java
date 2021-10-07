package sample1;

import java.util.Scanner;

public class palindromeUsingScanner {

	public static void main(java.lang.String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		for(int i=0;num>0;i++) {
			int rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}

		
		if(sum==temp) {
			System.out.println("it is palindrome");
		}
		else
			System.out.println("it is not palindrome");
	}}

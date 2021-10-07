
package sample1;

import java.util.Scanner;

public class ArmStrongWithScanner {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		  int num= sc.nextInt();
		int temp=num;
		int sum=0;
	
		for(int i=0;num>0;i++) {
			int rem=num%10;
			int prod=0;
			prod=prod+(rem*rem*rem);
			sum=sum+prod;
			num=num/10;
		
		}
		
		if(temp==sum) {
			System.out.println("it is armstrong");
			
		}
		else
			System.out.println("it is not armstrong");
			
		}
}

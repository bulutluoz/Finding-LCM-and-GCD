package git_gcd_lcm;

import java.util.Scanner;

public class FindingGcdLcm {

	public static void main(String[] args) {
		// Take 2 integers from user and find GCD (Greatest Common Divisor) and LCM (Least Common Multiple)
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter 2 positive integer");
		System.out.println("for finding GCD (Greatest Common Divisor) and LCM (Least Common Multiple)");
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		System.out.println("Numbers you entered are  " + num1 + " " + num2);
		int flag =0 ;
		
		
		// First we will calculate GCM
		int limitGCM =0;	// it is created to find which number is smaller than the other
		if (num1<num2) {
			limitGCM=num1;	
		}else limitGCM=num2;
		
		// we are starting from smaller number and decreasing by one on every step for finding GCM
		
		for(int i = limitGCM ; i>2 ; i--) {
			
			if(num1%i==0 && num2%i==0) {
				System.out.println("GCM for your numbers is = " + i);
				flag++;
				break;
			}
		} 
		if(flag==0) {
			System.out.println("There is no GCM for your numbers");}
		
		// // we are starting from 1 and increasing by one on every step for finding LCD until our limit (50.000)
		
		flag=0;

		for(int i = 1 ; i<50000 ; i++) {
			
			if(i%num1==0 && i%num2==0) {
				System.out.println("LCD for your numbers is = " + i);
				flag++;
				break;
			}
		} 
		if(flag==0) {
			System.out.println("There is no LCM until 50.000");
			
		// we searched until to 50.000 if we could not find LCD we will ask user 
		//
			System.out.println("If you want to continue, please enter MAX value for searching");
			int limit = scan.nextInt();
			for(int i = 1 ; i<limit ; i++) {
				
				if(i%num1==0 && i%num2==0) {
					System.out.println("LCD for your numbers is = " + i);
					flag++;
					break;
				}
			} 
			if(flag==0) {
				System.out.println("There is no LCM until your limit");	
		}
		}
		
		scan.close();
	}

}

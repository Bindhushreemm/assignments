package assignments;

import java.util.Scanner;
public class agevalidator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*******************Enter Details****************");
		System.out.print("Name : ");
		String name = sc.next();
		System.out.print("Age : ");
		int age = sc.nextInt();
		System.out.print("City : ");
		String city = sc.next();
		System.out.print("Nationality : ");
		String nation = sc.next();
		
		if(age >= 18 && age<=62) {
			if(nation.equals("Indian")) {
				System.out.println("Voter can vote, vote now.");
			}
			else {
				System.out.println("The Voter is not valid to vote.");
			}
		}
		else {
			System.out.println("The Voter is not valid to vote.");
		}
		
	}
}
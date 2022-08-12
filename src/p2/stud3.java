package p2;

import java.util.Scanner;

import assignments.stud1;
import p1.stud;

public class stud3 {
	public static void main(String[] args) {
		stud o=new stud();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the id");
		o.id=sc.nextInt();
		System.out.println("enter the name");
		o.name=sc.next();
		System.out.println("enter the city name");
		o.city=sc.next();
		System.out.println("enter the mobile");
		o.mobile=sc.nextLong();
		System.out.println("enter the cgpa");
		o.cgpa=sc.nextDouble();
		stud1 b=new stud1();
		b.display(o.id, o.name, o.city, o.mobile, o.cgpa);
		
	}

}

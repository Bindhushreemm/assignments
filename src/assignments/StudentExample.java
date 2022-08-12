package assignments;
import java.util.*;
class Student{
	int id;
	String name;
	String city;
	long mobile;
	double cgpa;
	public void display(int id,String name,String city,long mobile,double cgpa) {
		this.id=id;
		this.name=name;
		this.city=city;
		this.mobile=mobile;
		this.cgpa=cgpa;
		System.out.println("id:"+id+"\n"+"name:"+name+"\n"+"city:"+city+"\n"+"mobile:"+mobile+"\n"+"cgpa:"+cgpa);
	}
	
}

public class StudentExample {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the id");
		int id=sc.nextInt();
		System.out.println("enter the name");
		String name=sc.next();
		System.out.println("enter the city name");
		String city=sc.next();
		System.out.println("enter the mobile");
		long mobile=sc.nextLong();
		System.out.println("enter the cgpa");
		double cgpa=sc.nextDouble();
		Student o=new Student();
		o.display(id,name,city,mobile,cgpa);
		
	}
	

}

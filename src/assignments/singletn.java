package assignments;

import java.util.Scanner;

class SingleTn{
	static SingleTn obj = null;
	int id;
	String name;
	private SingleTn(){}
	public SingleTn(int id,String name) {
		System.out.println("id:"+id+"\n"+"name:"+name);
		
		
	}
	
	public static SingleTn getObj() {
		if(obj == null) {
			obj = new SingleTn();
		}
		return obj;
	}
}
public class singletn {
	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		SingleTn obj1 = SingleTn.getObj();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the id");
		 obj1.id=sc.nextInt();
		System.out.println("enter the name");
		obj1.name=sc.next();
		
		
		SingleTn obj2 = SingleTn.getObj();
		
		System.out.println("hashcode of object1:"+obj1.hashCode());
		System.out.println("hashcode of object2:"+obj2.hashCode());
	}
}
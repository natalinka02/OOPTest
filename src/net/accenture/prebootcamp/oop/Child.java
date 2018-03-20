package net.accenture.prebootcamp.oop;

public class Child extends Parent {
	String name = "Lucy";
	
	public void sleep() {
		System.out.println(name+" sleeps early");
	}
	
	public static void main(String...strings) {
		Child daughter = new Child();
		System.out.println(daughter.address);
		System.out.println(daughter.name);
		
			Parent father = new Parent();
			father.sleep();
			daughter.sleep();
			
		
	}
		

}

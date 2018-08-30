package spring_cons_injection_depedentObject;

public class Guest {
	
	private String name;
	private int age;
	Address address;
	
	public Guest(){
		System.out.println("Guest Cons()");
	}
	
	public Guest(String name){
		this.name = name;
	}

	public Guest(int age){
		this.age = age;
	}
	
	public Guest(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public Guest(String name, int age, Address address){
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public void show(){
		System.out.println("Hello "+name+"please find the below address:- "+address.toString());
	}
	
}

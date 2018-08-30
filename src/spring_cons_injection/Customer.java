package spring_cons_injection;

public class Customer {
	
	private String name;
	private int mobile;
	
	
	public Customer(){
		//default cons()
		System.out.println("hello to spring -  cons () injection");
	}
	
	public Customer(int mobile){
		//para cons(a)
		this.mobile = mobile;
	}
	
	public Customer(String name){
		//para cons(b)
		this.name = name;
	}
	
	public Customer(String name, int mobile){
		//para cons(a,b)
		this.name =name ;
		this.mobile = mobile;
	}
	
	public void displayInfo(){
		System.out.println("hi" + name + "Please contact me on :- "+mobile);
	}
	
	

}

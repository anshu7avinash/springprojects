package spring_autowire;

public class B {
	
	private String str;
	
	public B(){
		System.out.println("B is created successfully!!");
	}
	
	public B(String str){
		this.str = str;
	}
	
	public String toString(){
		return str;
	}
	
	public void print(){
		System.out.println("B is showing..");
	}

}

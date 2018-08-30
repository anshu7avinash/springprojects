package spring_autowire;

public class A {
	
	 B b;
	 
	 public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}

	public A(){
		 System.out.println("A is created!");
	 }
	 
	 public void print(){
		System.out.println("a is compiling..");
	 }
	 
	 public void show(){
		 print();
		 b.print();
	 }

}

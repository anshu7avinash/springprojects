package spring_app;

public class Employee {

	
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void displayInfo(){
		System.out.println("hello.. "+ name + "you are "+ age + " years old.");
	}
	
	
	
}

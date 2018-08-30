package spring_cons_injection_map;

public class User {
	
	private String name;
	private String topic;
	private String email;
	
	public User(){
		
	}
	
	public User(String name, String topic,String email){
		this.name = name;
		this.topic = topic;
		this.email = email;
	}
	
	public String toString(){
		return name + " on " + topic + " please contact on:-" +email;
	}

}

package spring_cons_injection_depedentObject;

public class Address {
	
	private String city;
	private String state;
	private String country;
	
	public Address(String city, String state, String country){
		super();
		this.city = city;
		this.state = state;
		this.country = country;
	}
	
	public Address(String city, String state){
		this.city = city;
		this.state =  state;
	}
	
	public String toString(){
		return city + " " +state + " "+country;
	}

}

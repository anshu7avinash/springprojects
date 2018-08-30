package spring_cons_injection_collections;

import java.util.Iterator;
import java.util.List;

public class UsersList {
	
	private String name;
	private int no_of_users;
	List<String> total;
	
	public UsersList() {
		// TODO Auto-generated constructor stub
	}
	
	public UsersList(String name, int nof, List<String> total){
		super();
		this.name = name;
		this.no_of_users = nof;
		this.total = total;
		
	}
	
	public void show(){
		System.out.println(name + " has  " + no_of_users + " users ");
		Iterator<String > itr = total.iterator();
		while(itr.hasNext()){
			String test =  itr.next();
			System.out.println("user :- "+test);
		}
		
	}
}

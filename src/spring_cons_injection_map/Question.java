package spring_cons_injection_map;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {
	
	private String name;
	private int age;
	private Map<Answer, User> answers;
	
	public Question(){
		
	}
	
	public Question(String name, int age, Map<Answer,User> map){
		super();
		this.name = name;
		this.age = age;
		this.answers = map;
	}
	
	public void show(){
		System.out.println("name - "+name);
		System.out.println("age - "+age);
		
		//Set is user to store the element for uniqueness 
		
		Set<Entry<Answer,User>> set = answers.entrySet();
		//Entry has been used to define the generic -- Answer is another pojo and Usr is anothe pojo for that 
		//only that can be inserted as the key-answer  and value-user.
		Iterator<Entry<Answer,User>> itr = set.iterator();
		
		while(itr.hasNext()){
			System.out.println("Map of the users");
			Answer ans = (Answer)itr.next();
			User  user = (User)itr.next();
			
			System.out.println("Answer : "+ans);
			System.out.println("Posted by :- "+user);
		}
	}

}

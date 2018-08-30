package spring_cons_injection_map;

import java.util.Date;

public class Answer {
	
	private int number;
	private String desc;
	private Date date;
	
	
	public Answer(){
		
	}
	
	public Answer(int number,String desc, Date date){
		super();
		this.number = number;
		this.desc = desc;
		this.date = date;
		
	}
	
	public String toString(){
		return desc + "posted on:  " + date + " for  " + number + " times";
	}

}

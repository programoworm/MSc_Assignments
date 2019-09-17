package com.person;
public class Person{
	public String name;
	public  int eid,salary;
	public void setData(int eid,String name){
		this.eid=eid;
		this.name=name;
	}
	public void getData(){
		System.out.println("Eid="+this.eid+" Name="+this.name);
	}
}

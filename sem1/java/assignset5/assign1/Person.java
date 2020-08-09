package com.person;
public class Person{
	public String name;
	public  int eid,salary;
	public Person(int eid,String name,int salary){
		this.eid=eid;
		this.name=name;
		this.salary=salary;
	}
	public void display(){
		System.out.println("Eid="+this.eid+" Name="+this.name+" salary="+this.salary);
	}
}

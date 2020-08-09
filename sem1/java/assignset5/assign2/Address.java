package com.address;
public class Address{
	public String address;
	public String name;
	public Address(String name,String address){
		this.address=address;
		this.name=name;
	}
	public void display(){
		System.out.println("Name="+this.name+" Adress="+this.address);
	}
}

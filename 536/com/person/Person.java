package com.person;
import java.io.*;
public class Person
{
	String name;
	int age;
	public Person(String name1,int age1)
	{
		name = name1;
		age = age1;
	}
	
	public void print()
	{
		System.out.println("name of the person is "+name);
		System.out.println("age of the person is "+age);
	}
}

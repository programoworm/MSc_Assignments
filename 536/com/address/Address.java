package com.address;
import java.io.*;
public class Address
{
	String addr2;
	public  Address(String addr1)
	{
		addr2=addr1;
	}
	
	public void print()
	{
		System.out.println("address of the person is "+addr2);
	}
}

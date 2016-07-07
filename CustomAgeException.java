package com.demo;
public class CustomAgeException extends Exception
{
	public CustomAgeException ()
	{

	}
	public CustomAgeException(String msg)
	{
		super(msg);
	}
	public void message()
	{	
		System.out.println("Coming from User defined exception handler...");
		System.out.println("Age must be between 20 to 60 to get a job here. This is a damn rule");
		System.out.println(getMessage());
	}	
}
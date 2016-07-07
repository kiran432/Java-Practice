package com.demo;
import java.util.*;
import java.io.*;

abstract class Employee{

	int age, salary;
	String name, designation;
	static Scanner sc =  new Scanner(System.in);
	static int count; 
	Employee() throws InputMismatchException,CustomAgeException
	{
		System.out.print("Entre name: ");
		this.name = sc.next();
		System.out.print("Enter Age:");
		this.age = sc.nextInt();
		if(this.age<20 || this.age>60)
			throw new CustomAgeException();	
		count++;
	}
	abstract public void raisesalary();	
}

final class Clerk extends Employee{

	Clerk() throws InputMismatchException,CustomAgeException{
		this.designation = "clerk";
		this.salary = 8000;
	
	}
	public void raisesalary()
	{
		this.salary+=2000;
	}

}

final class Programmer extends Employee{

	Programmer() throws InputMismatchException,CustomAgeException{
		this.designation = "Programmer";
		this.salary = 40000;
	
	}
	public void raisesalary()
	{
		this.salary+=20000;
	}

}

final class Manager extends Employee{

	Manager() throws InputMismatchException,CustomAgeException{
		this.designation = "Manager";
		this.salary = 80000;
	
	}
	public void raisesalary()
	{
		this.salary+=6000;
	}

}

public class EmployeeDemo {

		
	Employee emp[] = new Employee[500];

	public static void main(String args[])
	{
		
		EmployeeDemo dummy = new EmployeeDemo();
		System.out.println("Welcome to Employee management system");
		while(true){
			System.out.println("------");
			System.out.println("1.Create\n2.Display\n3.raisesalary\n4.Exit");
			System.out.println("------");
			Scanner sc =  new Scanner(System.in);
			int option = sc.nextInt();
			switch(option){
			case 1: 
				dummy.Create();
				break;
			case 2:
				dummy.Display();
				break;
			case 3:
				dummy.RaiseSalary();
				break;
			case 4:
				System.out.println("Number of employees in organization: " + Employee.count);	
				return;
			default :
				System.out.println("Invalid option");
				break;
			}
		}
	}
	public void Create(){
			if (Employee.count == 500){
				System.out.println("Size is full");
				return;
			}
		while(true){
				try{
					System.out.println("------");
					System.out.println("1.Clerk\n2.Programmer\n3.Manager\n4.Exit");
					System.out.println("-------");	
					Scanner sc =  new Scanner(System.in);
						
					int option = sc.nextInt();
					switch(option){
					case 1: 
						emp[Employee.count] = new Clerk();
						break;
					case 2:
						emp[Employee.count] = new Programmer();
						break;
					case 3:
						emp[Employee.count] = new Manager();
						break;
					case 4:
						return;
					default:
						System.out.println("Invalid option");
						break;
					}	
	
				}
				catch (InputMismatchException e) {
 				   System.out.println(e); //try to find out specific reason.
				}
				catch (CustomAgeException e){
					System.out.println(e);
				}
				
			}		
		
	}
	public void RaiseSalary(){
		
		for(int i=0; i<Employee.count; i++){
			emp[i].raisesalary();
		}
	}
	public void Display(){	
		
		System.out.println("----------------");
		for(int i=0;i< Employee.count; i++){	
			System.out.println("Name of the employee: " + emp[i].name + "\nAge: " + emp[i].age + "\ndesignation: "+ emp[i].designation + "\nSalary: "+ emp[i].salary );
			System.out.println("------");
		}			

	}
}
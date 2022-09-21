package com.codebind;


public class Emp2 {
	
	    int id;
	    String name, address;
	    String phone;
	     Emp2(int i, String n, String a, String p){
	        this.id = i;
	        this.name = n;
	        this.address = a;
	        this.phone = p;
	    }

	    public void display(int i){
	        System.out.println("Name:"+id+"\nphone:"+phone);
	    }

	    public void display(){
	        System.out.println("\nName:"+name+"\nAddress:"+address);
	    }
	    
	    public static void main(String args[]){

	        Emp2 obj1 = new Emp2(101,"Dhiraj","Bihar", "9123265302");
	        HR obj2 = new HR(101,"Dhiraj","Bihar", "9123265302", 35000);
	        obj1.display(1);
	        obj1.display();
	        obj2.empWithSalary();
	        obj2.empWithSalary(3000);
	    }

	}

 class HR extends Emp2{
	    int salary;
	    public HR(int i, String n, String a, String p, int sal) {
	        super(i, n, a, p);
	        this.salary = sal;
	    }

	    public void empWithSalary(){
	        System.out.println("\nEmployee Name: "+name+"\nSalary: "+salary);
	    }

	    public void empWithSalary(int tax){
	        System.out.println("\nEmployee Name: "+name+"\nSalary: "+(salary-tax)+"\nTax Deducted: "+tax);
	    }
	    
	}



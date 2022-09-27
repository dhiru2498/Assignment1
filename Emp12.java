package com.codebind;

public class Emp12 {
	 int id;  
	 String name, address;
	 String phone;
	 String type;
	    
	Emp12(int i, String n, String a, String p,String t){
        this.id = i;
        this.name = n;
        this.address = a;
        this.phone = p;
        this.type=t;
    }
	public void testdm() {
		if(type.equals("Hr"))
		{
			System.out.println("Inside Hr");
			
		}
		else if(type.equals("admin"))
		{
			System.out.println("Inside admin");
		}
		else
		{
			System.out.println("infra");
		}
	}


   public void display(int i){
        System.out.println("Name:"+id+"\nphone:"+phone);
    }


   public void display(){
        System.out.println("\nName:"+name+"\nAddress:"+address);
    }
   
   
   public static void main(String[] args) {
	   Emp12 obj = new Emp12(101, "Dhiraj", "Bihar" ,"9123265302","Hr");
	   Emp12 obj1=new Emp12(101, "Dhiraj", "Bihar" ,"9123265302","admin");
	   Emp12 obj2=new Emp12(101, "Dhiraj", "Bihar" ,"9123265302","infra");
	   
	   obj.testdm();
	   obj1.testdm();
	   obj2.testdm();
   }
   
}


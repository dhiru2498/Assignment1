package com.codebind;

public class Switch {
	 int id;  
	 String name, address;
	 String phone;
	 String type;
	    
	Switch(int i, String n, String a, String p,String t){
        this.id = i;
        this.name = n;
        this.address = a;
        this.phone = p;
        this.type=t;
    }
	public void testdm() {
		switch(type) {
		case "Hr":System.out.println("Inside Hr");
		break;
		case "admin":System.out.println("Inside admin");
		break;
		default:System.out.println("infra");
		break;
		}
	}


public static void main(String[] args) {
	   Switch obj = new Switch(101, "Dhiraj", "Bihar" ,"9123265302","Hr");
	   Switch obj1=new Switch(101, "Dhiraj", "Bihar" ,"9123265302","admin");
	   Switch obj2=new Switch(101, "Dhiraj", "Bihar" ,"9123265302","infra");
	   
	   //obj.testdm();
	   //obj1.testdm();
	   obj2.testdm();
}

}



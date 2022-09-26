package com.codebind;

final public class Immutable2 
{		
		
		    private final int id;
		    private final String name;
		    
		    
		    public int getId(){
		        return id;
		    }
		 
		    public String getName(){
		        return name;
		    }
		    
		    public Immutable2(int a,String b){
		        this.id=a;
		        this.name=b;
		    }

		    public static void main(String[] args) {
		        Immutable2 i=new Immutable2(22,"pqr");
		        System.out.println(i.name);
		        
		    
		    }
}


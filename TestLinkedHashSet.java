package org.example;

	import java.util.LinkedHashSet;

	public class TestLinkedHashSet {
	    public static void main(String args[]){
	        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();

	        linkedHashSet.add(20);
	        linkedHashSet.add(20);
	        linkedHashSet.add(85);
	        linkedHashSet.add(null);
	        linkedHashSet.add(85);
	        linkedHashSet.add(60);
	        linkedHashSet.add(20);
	        linkedHashSet.add(null);
	        linkedHashSet.add(77);
	        linkedHashSet.add(44);

	        System.out.println(linkedHashSet);
	    }
}


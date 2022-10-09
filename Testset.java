package org.example;

import java.util.HashSet;

public class Testset {
    public static void main(String args[]){

        HashSet<Integer> set = new HashSet<>();

        set.add(20);
        set.add(30);
        set.add(99);
        set.add(null);
        set.add(88);
        set.add(77);
        set.add(66);
        set.add(null);
        set.add(89);
        set.add(22);

        System.out.println(set);

    }
}

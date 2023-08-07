package com.caveofprogramming.examples.guava_example;

import com.google.common.collect.Multiset;
import com.google.common.collect.HashMultiset;


/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		
		System.out.println("Hello World!");
		
		Multiset<String> animals = HashMultiset.create();
		animals.add("cat");
		animals.add("dog");
		animals.add("pig");
		
		animals.forEach(System.out::println);
		
	}
}

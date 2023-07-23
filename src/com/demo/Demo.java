package com.demo;

import java.util.function.Function;
import java.util.function.Predicate;

public class Demo{
	
	public  static int squreIt(int n) {
		return n*n;
	}
	
    public static void main(String[] args){
    	Predicate <Integer> p=i->i%2==0;
    	Function <Integer,Integer> f=i->i*i;
    	System.out.println("the squre of the 3>>"+f.apply(78));
    	System.out.println("the squre of the 3>>"+p.test(65));
    	 }}
		
		
		
		
		

	 
	 
	 
	
 
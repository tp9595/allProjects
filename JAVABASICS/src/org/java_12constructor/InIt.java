package org.java_12constructor;

public class InIt {

	    // block to be executed before any constructor.
	    {
	    	
	        System.out.println("init block");
	    }
	 
	    // no-arg constructor
	    InIt()
	    {
	    	this(20);
	        System.out.println("default");
	    }
	 
	    // constructor with one argument.
	    InIt(int x)
	    {
	        System.out.println(x);
	    }
	 
	    public static void main(String[] args)
	    {
	        // Object creation by calling no-argument
	        // constructor.
	        new InIt();
	 
	        // Object creation by calling parameterized
	        // constructor with one parameter.
	        new InIt(10);
	    }
	}

	



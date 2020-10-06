package com.capgemini.example;

import java.util.*;

public class ExampleMain {
	
	enum toss{
		Heads,Tails;
	}

	public static void main(String[] args) {
	    int tossValue = (int) Math.floor((Math.random()*10)%2);
	    toss t;
	    if(tossValue == 0)
	    	t = toss.Heads;
	    else
	    	t = toss.Tails;
	    System.out.println("Toss Outcome is "+t);
	    
	    if(t==toss.Heads)
	    	System.out.print("You Won the toss");
	    else
	    	System.out.println("You lost the toss");

	}

}

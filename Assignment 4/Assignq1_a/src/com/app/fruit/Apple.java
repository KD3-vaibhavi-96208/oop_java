package com.app.fruit;

public class Apple extends fruit {
	

	

	    public Apple(String name, String color,double weight) {
	        super(name, color, weight ,false);
	    }

	    @Override
	    public String taste() {
	        return "sweet and sour";
	    }
	}
	
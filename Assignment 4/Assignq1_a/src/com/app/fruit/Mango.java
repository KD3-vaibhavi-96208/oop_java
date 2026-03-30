package com.app.fruit;

public class Mango extends fruit {
	
	public Mango( String name, String color,double weight ) {
		super(name, color, weight ,true );
		
	}
	
	@Override
	public String taste() {
		return "sweet ";
	}

}



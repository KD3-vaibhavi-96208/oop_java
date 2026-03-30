package com.app.fruit;

public class Orange extends fruit {
	
	public Orange( String name,String color , double weight  ) {
		super(  name ,color,weight ,true);
	}
	

	@Override
	public String taste() {
		return "Sour";
	}

}

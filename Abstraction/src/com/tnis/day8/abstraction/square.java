package com.tnis.day8.abstraction;

public class square extends shape {

	private float side;
	
	public Square() {
		side = 2.0f;
	}
	public square(float side) {
		this.side = side;
	}
	@override
	voide calArea() {
		super.area = side * side;
	}

}

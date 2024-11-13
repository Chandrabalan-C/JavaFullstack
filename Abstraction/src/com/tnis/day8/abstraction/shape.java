package com.tnis.day8.abstraction;

public abstract class shape{
	protected float area;
	
	abstract void calArea();
	
	void show() {
		System.out.println("Area of shape is "+area);
	}
}
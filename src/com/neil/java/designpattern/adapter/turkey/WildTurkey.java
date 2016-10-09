package com.neil.java.designpattern.adapter.turkey;

public class WildTurkey implements Turkey {

	@Override
	public void gobble() {
		// TODO Auto-generated method stub
		System.out.println("Ga Ga");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("I am flying a short distance");
	}

}

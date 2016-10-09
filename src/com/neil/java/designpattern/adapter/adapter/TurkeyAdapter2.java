package com.neil.java.designpattern.adapter.adapter;

import com.neil.java.designpattern.adapter.duck.Duck;
import com.neil.java.designpattern.adapter.turkey.WildTurkey;

public class TurkeyAdapter2 extends WildTurkey implements Duck {

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		super.gobble();
	}

	@Override
	public void fly() {
		super.fly();
		super.fly();
		super.fly();
	}
}

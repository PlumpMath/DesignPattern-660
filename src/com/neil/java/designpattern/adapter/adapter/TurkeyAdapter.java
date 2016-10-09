package com.neil.java.designpattern.adapter.adapter;

import com.neil.java.designpattern.adapter.duck.Duck;
import com.neil.java.designpattern.adapter.turkey.Turkey;

/**
 * 由于我们希望Turkey能够具有鸭子的外观，因此TurkeyAdapter需要实现Duck接口
 * 
 * @author Administrator
 *
 */
public class TurkeyAdapter implements Duck {
	private Turkey turkey;

	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}

	@Override
	public void quack() {
		turkey.gobble();

	}

	@Override
	public void fly() {
		for (int i = 0; i < 6; i++) {
			turkey.fly();
		}
	}

}

package com.neil.java.designpattern.adapter.adapter;

import com.neil.java.designpattern.adapter.duck.Duck;
import com.neil.java.designpattern.adapter.turkey.Turkey;

/**
 * ��������ϣ��Turkey�ܹ�����Ѽ�ӵ���ۣ����TurkeyAdapter��Ҫʵ��Duck�ӿ�
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

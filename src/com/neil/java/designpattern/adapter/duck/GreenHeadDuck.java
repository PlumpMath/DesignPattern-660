package com.neil.java.designpattern.adapter.duck;

/**
 * ��ͷѼʵ��Duck�ӿ�
 * @author Administrator
 *
 */
public class GreenHeadDuck implements Duck{

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("Ga Ga");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("I am flying a long distance");
	}
	
	
}

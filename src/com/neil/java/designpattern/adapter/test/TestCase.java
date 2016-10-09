package com.neil.java.designpattern.adapter.test;

import org.junit.Test;

import com.neil.java.designpattern.adapter.adapter.TurkeyAdapter;
import com.neil.java.designpattern.adapter.adapter.TurkeyAdapter2;
import com.neil.java.designpattern.adapter.duck.Duck;
import com.neil.java.designpattern.adapter.duck.GreenHeadDuck;
import com.neil.java.designpattern.adapter.turkey.WildTurkey;

public class TestCase {

	@Test
	public void case1() {
		GreenHeadDuck duck = new GreenHeadDuck();
		WildTurkey turkey = new WildTurkey();

		Duck duck2TurkeyAdapter = new TurkeyAdapter(turkey);
		System.out.println("-------------------------------");
		System.out.println("������Ұ���Ķ���");
		turkey.gobble();
		turkey.fly();
		System.out.println("-------------------------------");
		System.out.println("������Ѽ�ӵĶ���");
		duck.quack();
		duck.fly();

		System.out.println("-------------------------------");
		System.out.println("������һֻ��������Ѽ�ӵĻ���װѼ��");
		duck2TurkeyAdapter.quack();
		duck2TurkeyAdapter.fly();
	}
	
	@Test
	public void case2()
	{
		GreenHeadDuck duck = new GreenHeadDuck();
		WildTurkey turkey = new WildTurkey();
		
		Duck duck2TurkeyAdapter = new TurkeyAdapter2();
		System.out.println("-------------------------------");
		System.out.println("������Ұ���Ķ���");
		turkey.gobble();
		turkey.fly();
		System.out.println("-------------------------------");
		System.out.println("������Ѽ�ӵĶ���");
		duck.quack();
		duck.fly();
		System.out.println("-------------------------------");
		System.out.println("������һֻ��������Ѽ�ӵĻ���װѼ��");
		duck2TurkeyAdapter.quack();
		duck2TurkeyAdapter.fly();
	}
}

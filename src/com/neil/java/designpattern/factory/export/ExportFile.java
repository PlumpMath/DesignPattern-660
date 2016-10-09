package com.neil.java.designpattern.factory.export;

/**
 * 工厂方法模式所创建的对象的超类，也就是所有导出类的共同父类或共同拥有的接口。 
 * 在实际的系统中，这个角色也常常使用抽象类实现。
 * 
 * @author Administrator
 *
 */
public interface ExportFile {
	public boolean export(String data);
}

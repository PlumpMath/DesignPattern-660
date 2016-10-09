package com.neil.java.designpattern.factory.factory;

import com.neil.java.designpattern.factory.export.ExportFile;

/**
 * 接口中的方法声明不能是private 和protected
 * 
 * @author Administrator
 *
 */
public interface ExportFactory {
	public ExportFile  factory(String type);
}

package com.neil.java.designpattern.factory.factory;

import com.neil.java.designpattern.factory.export.ExportFile;

/**
 * �ӿ��еķ�������������private ��protected
 * 
 * @author Administrator
 *
 */
public interface ExportFactory {
	public ExportFile  factory(String type);
}

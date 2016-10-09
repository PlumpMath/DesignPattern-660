package com.neil.java.designpattern.factory.factory;

import com.neil.java.designpattern.factory.export.ExportFile;
import com.neil.java.designpattern.factory.export.ExportFinancialHtmlFile;
import com.neil.java.designpattern.factory.export.ExportStandardHtmlFile;

/**
 * 导出HTML文件工厂类
 * @author Administrator
 *
 */
public class ExportHtmlFactory implements ExportFactory {

	@Override
	public ExportFile factory(String type) {

		if ("standard".equals(type)) {
			return new ExportStandardHtmlFile();
		} else if ("financial".equals(type)) {
			return new ExportFinancialHtmlFile();
		} else {
			throw new RuntimeException("没有找到对象");
		}
	}

}

package com.neil.java.designpattern.factory.factory;

import com.neil.java.designpattern.factory.export.ExportFile;
import com.neil.java.designpattern.factory.export.ExportFinancialHtmlFile;
import com.neil.java.designpattern.factory.export.ExportFinancialPdfFile;
import com.neil.java.designpattern.factory.export.ExportStandardPdfFile;

/**
 * 导出PDF文件工厂类
 * @author Administrator
 *
 */
public class ExportPdfFactory implements ExportFactory {

	@Override
	public ExportFile factory(String type) {
		if ("standard".equals(type))
			return new ExportStandardPdfFile();
		else if ("financial".equals(type))
			return new ExportFinancialPdfFile();
		else
			throw new RuntimeException("没有找到合适的生产工厂");
	}

}

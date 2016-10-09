package com.neil.java.designpattern.factory.factory;

import com.neil.java.designpattern.factory.export.ExportFile;
import com.neil.java.designpattern.factory.export.ExportFinancialHtmlFile;
import com.neil.java.designpattern.factory.export.ExportFinancialPdfFile;
import com.neil.java.designpattern.factory.export.ExportStandardPdfFile;

/**
 * ����PDF�ļ�������
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
			throw new RuntimeException("û���ҵ����ʵ���������");
	}

}

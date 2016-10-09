package com.neil.java.designpattern.factory.export;

/**
 * 导出财务版HTML文件
 * @author Administrator
 *
 */
public class ExportFinancialHtmlFile implements ExportFile {

	@Override
	public boolean export(String data) {
		System.out.println("导出财务版HTML文件");
		return false;
	}

}

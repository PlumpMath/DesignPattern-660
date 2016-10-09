package com.neil.java.designpattern.factory.export;
/**
 * 导出财务版PDF文件
 * @author Administrator
 *
 */
public class ExportFinancialPdfFile implements ExportFile {

	@Override
	public boolean export(String data) {
		System.out.println("导出财务版PDF文件");
		return false;
	}

}

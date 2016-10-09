package com.neil.java.designpattern.factory.export;

/**
 * 导出标准PDF文件
 * 
 * @author Administrator
 *
 */
public class ExportStandardPdfFile implements ExportFile {

	@Override
	public boolean export(String data) {
		System.out.println("导出标准PDF文件");
		return false;
	}

}

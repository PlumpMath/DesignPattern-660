package com.neil.java.designpattern.factory.export;

/**
 * ������׼PDF�ļ�
 * 
 * @author Administrator
 *
 */
public class ExportStandardPdfFile implements ExportFile {

	@Override
	public boolean export(String data) {
		System.out.println("������׼PDF�ļ�");
		return false;
	}

}

package com.neil.java.designpattern.factory.export;

/**
 * ���������HTML�ļ�
 * @author Administrator
 *
 */
public class ExportFinancialHtmlFile implements ExportFile {

	@Override
	public boolean export(String data) {
		System.out.println("���������HTML�ļ�");
		return false;
	}

}

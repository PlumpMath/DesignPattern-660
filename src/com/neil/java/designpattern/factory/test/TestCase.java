package com.neil.java.designpattern.factory.test;

import org.junit.Test;

import com.neil.java.designpattern.factory.export.ExportFile;
import com.neil.java.designpattern.factory.factory.ExportFactory;
import com.neil.java.designpattern.factory.factory.ExportHtmlFactory;
import com.neil.java.designpattern.factory.factory.ExportPdfFactory;

public class TestCase {
	@Test
	public void case1() {
		String data = "";

		/**
		 * ���������HTML�ļ�
		 */
		ExportFactory exportFactory = new ExportHtmlFactory();
		ExportFile ef = exportFactory.factory("financial");
		ef.export(data);

		/**
		 * ������׼HTML�ļ�
		 */
		exportFactory = new ExportHtmlFactory();
		ef = exportFactory.factory("standard");
		ef.export(data);

		/**
		 * ������׼PDF�ļ�
		 */
		exportFactory = new ExportPdfFactory();
		ef = exportFactory.factory("standard");
		ef.export(data);

		/**
		 * ���������PDF�ļ�
		 */
		exportFactory = new ExportPdfFactory();
		ef = exportFactory.factory("financial");
		ef.export(data);
	}
}

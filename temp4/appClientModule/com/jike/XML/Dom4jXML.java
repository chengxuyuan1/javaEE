package com.jike.XML;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;

public class Dom4jXML {
	public static void main(String[] args) {
		String xml="<root><peple>acely</peple></root>";
		try {
			Document document=DocumentHelper.parseText(xml);
			System.out.println(document.asXML());
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

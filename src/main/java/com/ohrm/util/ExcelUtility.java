package com.ohrm.util;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {

	public static Object[][] getData(String path, String sheetName) throws IOException {
		XSSFWorkbook wb = new XSSFWorkbook(path);
		XSSFSheet sheet = wb.getSheet(sheetName);
		int rowcount = sheet.getPhysicalNumberOfRows();
		short colcount = sheet.getRow(0).getLastCellNum();
		Object[][] data = new Object[rowcount][colcount];

		for (int row = 0; row < rowcount; row++) {
			for (int col = 0; col < colcount; col++) {
				data[row][col] = sheet.getRow(row).getCell(col).getStringCellValue();
			}
		}
		return data;
	}
}

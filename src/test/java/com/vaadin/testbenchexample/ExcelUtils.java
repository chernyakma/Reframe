package com.vaadin.testbenchexample;


import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

// ExcelUtils.java
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcelUtils {

	/**
	 * Reads the first sheet and returns rows with a fixed number of columns.
	 * - Preserves empty cells (as "")
	 * - Prevents shifting when cells are blank
	 * - Formats values as displayed in Excel (DataFormatter)
	 *
	 * @param filePath     path to .xlsx
	 * @param expectedCols number of columns you expect in each row (e.g., 10 for family, 4 for address)
	 */
	public static List<String[]> readExcelData(String filePath, int expectedCols) {
		List<String[]> data = new ArrayList<>();

		try (FileInputStream fis = new FileInputStream(filePath);
			 Workbook workbook = new XSSFWorkbook(fis)) {

			Sheet sheet = workbook.getSheetAt(0);
			DataFormatter fmt = new DataFormatter();
			FormulaEvaluator evaluator = workbook.getCreationHelper().createFormulaEvaluator();

			// Iterate by fixed column index to keep blanks
			int firstRow = sheet.getFirstRowNum();
			int lastRow  = sheet.getLastRowNum();

			for (int r = firstRow; r <= lastRow; r++) {
				Row row = sheet.getRow(r);
				String[] out = new String[expectedCols];

				for (int c = 0; c < expectedCols; c++) {
					Cell cell = (row == null)
							? null
							: row.getCell(c, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
					String val = (cell == null) ? "" : fmt.formatCellValue(cell, evaluator);
					out[c] = (val == null) ? "" : val.trim();
				}
				data.add(out);
			}

		} catch (IOException e) {
			throw new RuntimeException("Failed to read Excel: " + filePath, e);
		}

		return data;
	}

	/** Convenience: read a single zero-based row (no header assumptions) */
	public static String[] readExcelRow(String filePath, int expectedCols, int rowIndex) {
		List<String[]> all = readExcelData(filePath, expectedCols);
		if (rowIndex < 0 || rowIndex >= all.size()) {
			throw new IllegalArgumentException("Row " + rowIndex + " out of range (size=" + all.size() + ")");
		}
		return all.get(rowIndex);
	}
}



package org.testing.Trigger;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

	import jxl.Cell;
	import jxl.Sheet;
	import jxl.Workbook;
import jxl.read.biff.BiffException;

	//Read all file data
public class ReadExcelFile {
	
	public void readExcel() throws BiffException, IOException {
		String FilePath = "../YTFramwork/src/org/testing/InputData/Excelinput.xls.xls";
		FileInputStream fs = new FileInputStream(FilePath);
		Workbook wb = Workbook.getWorkbook(fs);

		// TO get the access to the sheet
		Sheet sh = wb.getSheet("Sheet 1-1");

		// To get the number of rows present in sheet
		int totalNoOfRows = sh.getRows();

		// To get the number of columns present in sheet
		int totalNoOfCols = sh.getColumns();

		for (int row = 0; row < totalNoOfRows; row++) {

			for (int col = 0; col < totalNoOfCols; col++) {
				System.out.print(sh.getCell(col, row).getContents() + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String args[]) throws BiffException, IOException {
		ReadExcelFile DT = new ReadExcelFile();
		DT.readExcel();
	}
}

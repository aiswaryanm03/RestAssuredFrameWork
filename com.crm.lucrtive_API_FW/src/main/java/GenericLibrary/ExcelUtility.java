package GenericLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.usermodel.WorkbookFactory.*;

public class ExcelUtility {
	public String getDataFromExcel(String SheetName,int RowNum,int CellNum) throws Throwable
	{
		FileInputStream file=new FileInputStream(".\\src\\test\\resources\\DataDrivenTest.xlsx");
		Workbook book=WorkbookFactory.create(file);
		org.apache.poi.ss.usermodel.Sheet sh=book.getSheet(SheetName);
		Row rw=sh.getRow(RowNum);
		Cell cl=rw.getCell(CellNum);
		DataFormatter format=new DataFormatter();
		String data=format.formatCellValue(cl);
		book.close();
		return data;
	}

}

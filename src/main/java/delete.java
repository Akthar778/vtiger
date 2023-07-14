import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class delete {
	@DataProvider(name = "testdata")
	@Test
	public Object[][] readingMutipleData() throws EncryptedDocumentException, IOException {
		// Giving Path.
		File file = new File("./src/test/resources/TestData1.xlsx");

		// converting into workbook and add it
		Workbook workbook = WorkbookFactory.create(file);

		// getting sheetName
		Sheet sheet = workbook.getSheet("Sheet1");

		// getting all rows in the form of int
		int rowCount = sheet.getPhysicalNumberOfRows();

		// getting all the cells in the form of int
		int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();

		// here storing in array Object
		Object[][] data = new Object[rowCount][cellCount];

		// retriving the data
		Row actualRow;

		for (int row = 0; row < rowCount; row++) {
			// taking all rows which are present in sheet
			actualRow = sheet.getRow(row);

			for (int cell = 0; cell < actualRow.getLastCellNum(); cell++) {
				// taking all cells - storing in array
				data[row][cell] = actualRow.getCell(cell).toString();
			}
		}

		// returing the all data
		return data;

	}

}

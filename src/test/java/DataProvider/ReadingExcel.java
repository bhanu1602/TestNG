package DataProvider;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadingExcel {

    @DataProvider(name = "loginTestData")
    public Object[][] getData() throws Exception {
        File excelFile = new File("src/resources/Book1.xlsx");
        System.out.println(excelFile.exists());
        FileInputStream fis = new FileInputStream(excelFile);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet("Sheet1");
        int numberOfRows = sheet.getPhysicalNumberOfRows();
        int numberOfColumns = sheet.getRow(0).getLastCellNum();

        String[][] data = new String[numberOfRows-1][numberOfColumns];
        for (int i = 0; i < numberOfRows-1 ; i++) {
            for (int j = 0; j < numberOfColumns ; j++) {
                DataFormatter df = new DataFormatter();
                data[i][j] = df.formatCellValue(sheet.getRow(i).getCell(j));
                System.out.println(sheet.getRow(i+1).getCell(j).getStringCellValue());
            }
            System.out.println();
        }

        workbook.close();
        fis.close();
        return data;
    }

}

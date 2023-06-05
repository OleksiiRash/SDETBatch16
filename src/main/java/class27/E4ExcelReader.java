package class27;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import utils.Constants;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E4ExcelReader {
    public static void main(String[] args) throws IOException {

        var fis = new FileInputStream(Constants.EXCEL_FILE_PATH);
        // that special call which knows how to read the data from Excel files only
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fis);
        var sheet = xssfWorkbook.getSheet("Лист1");

        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
            Row row = sheet.getRow(i);

            for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
                System.out.print(row.getCell(j) + " ");
            }
            System.out.println();
        }


    }
}

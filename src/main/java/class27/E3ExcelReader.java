package class27;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import utils.ConfigReader;
import utils.Constants;

import java.io.FileInputStream;
import java.io.IOException;

public class E3ExcelReader {

    public static void main(String[] args) throws IOException {

        var fis = new FileInputStream(Constants.EXCEL_FILE_PATH);
        // that special call which knows how to read the data from Excel files only
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fis);
        var sheet = xssfWorkbook.getSheet("Sheet1");
        var row = sheet.getRow(3); // rows
        var cell = row.getCell(2); // columns
        System.out.println(cell);


    }
}

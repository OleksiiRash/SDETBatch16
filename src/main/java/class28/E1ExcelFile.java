package class28;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class E1ExcelFile {

    public static void main(String[] args) {

        var xssfWorkbook = new XSSFWorkbook();
        var sheet = xssfWorkbook.createSheet("Sheet1");
        var row = sheet.createRow(0);



    }
}

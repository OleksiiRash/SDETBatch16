package class28;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class E1ExcelFile {

    public static void main(String[] args) throws IOException {

        var path = System.getProperty("user.dir") + "\\Files\\TestExcelFIle.xlsx";
        var fileInputStream = new FileInputStream(path);
        //1)Software 2) Path 3) Store the file
        var xssfWorkbook = new XSSFWorkbook(fileInputStream);
        //   Sheet sheet = xssfWorkbook.createSheet("Sheet1");
        var sheet = xssfWorkbook.getSheet("Sheet1");
        var row = sheet.createRow(0);
        var cell = row.createCell(0);
        var cell1 = row.createCell(1);
        cell.setCellValue("Wael");
        cell1.setCellValue("Jacob");
        // used when we have to create a new file, or we write data to a file
        var fileOutputStream = new FileOutputStream(path);
        xssfWorkbook.write(fileOutputStream);

    }
}

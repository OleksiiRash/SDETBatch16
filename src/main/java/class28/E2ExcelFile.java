package class28;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class E2ExcelFile {
    public static void main(String[] args) throws IOException {

        var path = System.getProperty("user.dir") + "\\Files\\Employees.xlsx";
        // we use FileInputStream not to lose the data if we rewrite the file
        var fis = new FileInputStream(path);
        var xssfWorkbook = new XSSFWorkbook(fis);
        var getSheet = xssfWorkbook.getSheet("Sheet1");
        var row = getSheet.createRow(5);

        row.createCell(0).setCellValue("Bax");
        row.createCell(1).setCellValue("Banny");
        row.createCell(2).setCellValue("New");
        row.createCell(3).setCellValue(12);
        row.createCell(4).setCellValue(300000);
        // we use FileOutPutStream to add the data in the file & create an empty file
        var fos = new FileOutputStream(path);
        xssfWorkbook.write(fos); // write data in the file


    }
}

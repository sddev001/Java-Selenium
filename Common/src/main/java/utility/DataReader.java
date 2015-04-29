package utility;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;

/**
 * Created by Shibu on 4/25/2015.
 */
public class DataReader {
    int numberOfRows, numberOfCol;
    public String[][] fileReader(String path) throws InterruptedException, IOException {
        String [][] data = {};
        File file = new File(path);
        FileInputStream fis = new FileInputStream(file);
        HSSFWorkbook wb = new HSSFWorkbook(fis);
        HSSFSheet sheet = wb.getSheetAt(0);
      //  XSSFWorkbook wb = new XSSFWorkbook(fis);
      //  XSSFSheet sheet = wb.getSheetAt(0);
        numberOfRows = sheet.getLastRowNum();
        numberOfCol = sheet.getRow(0).getLastCellNum();
        data = new String[numberOfRows+1][numberOfCol+1];

        for(int i = 1; i<data.length; i++){
            HSSFRow rows = sheet.getRow(i);
        //    XSSFRow rows = sheet.getRow(i);
            for(int j=0; j<numberOfCol; j++){
                HSSFCell cell = rows.getCell(j);
         //       XSSFCell cell = rows.getCell(j);
                String cellData = getCellValue(cell);
            //    System.out.println(cellData);
                data[i][j]=cellData;
            }
        }

        return data;
    }


    public String getCellValue(HSSFCell cell){
        Object value = null;

        int dataType = cell.getCellType();
        switch (dataType){
            case XSSFCell.CELL_TYPE_NUMERIC:
                value = cell.getNumericCellValue();
                break;
            case XSSFCell.CELL_TYPE_STRING:
                value = cell.getStringCellValue();
                break;
            case XSSFCell.CELL_TYPE_BOOLEAN:
                value = cell.getBooleanCellValue();

        }
        return value.toString();
    }
}

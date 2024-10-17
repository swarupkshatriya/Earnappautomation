
package testdatareader;


import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import java.io.*;
import java.util.*;

public class TestDataReader {
    Properties prop=new Properties();
    Properties prop2=new Properties();
    String workbookname,sheetname;
    XSSFWorkbook wb;
    XSSFSheet sheet;
    XSSFCell cellval,topCellValue;
    String data;
    String topRowData;
    Map<Object,Map<String,String>> datatable= new HashMap<Object,Map<String,String>>();
    Map<String,String> datatable1= new HashMap<String,String>();
    int matchingrow;

    public XSSFWorkbook getWb() {
        return wb;
    }

    public void setWb(XSSFWorkbook wb) {
        this.wb = wb;
    }

 
//    public static void main(String args[]){
//        TestDataReader tdr=new TestDataReader();
//        tdr.readTestData();
//    }

    public TestDataReader() {

    }




    public Map<String,String> readTestData(String testCaseName) {
        try {

//            test=ExtentReportsManager.getInstance(getExtent()).getExtents().createTest(testCaseName);
//            ExtentTestManager.getInstance(test).getTest().log(Status.INFO,String.valueOf("Thread ID is "+Thread.currentThread().getId()));
            return checkTestDataFile(testCaseName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public synchronized Map<String,String> checkTestDataFile(String testCaseName) throws IOException {
        prop.load(new FileInputStream( new File(System.getProperty("user.dir")+"\\applicationproperties\\"+"testconfiguration.properties")));
        workbookname=prop.getProperty("workbookname");
        sheetname=prop.getProperty("testsheetname");
        File file=new File(System.getProperty("user.dir")+"\\TestDataSheet\\"+workbookname);
        try {
            wb= new XSSFWorkbook(file);
            sheet=wb.getSheet(sheetname);
            setWb(wb);
            int noofrows=sheet.getLastRowNum();
            int colnumber=sheet.getRow(noofrows).getPhysicalNumberOfCells();
            int topRow=sheet.getTopRow();
            int topColNum=sheet.getRow(topRow).getPhysicalNumberOfCells();
            for (int i=1;i<=noofrows;i++){
                if(sheet.getRow(i).getCell(0).toString().equals(testCaseName)){  //&& sheet.getRow(i).getCell(1).toString().equals("Y")
                    matchingrow=i;
                   // ExtentTestManager.getInstance(test).getTest().log(Status.INFO,String.valueOf("ThreadID matching row is "+Thread.currentThread().getId()));
                    break;
                }

            }
            if(matchingrow>=1) {

                for (int j = 0; j < colnumber; j++) {
                    cellval = sheet.getRow(matchingrow).getCell(j);
                    switch (cellval.getCellType()) {
                        case STRING:
                            data = cellval.getStringCellValue();
                            break;

                        case NUMERIC:
                            data = String.valueOf(cellval.getNumericCellValue());
                            break;

                        case FORMULA:
                            data = cellval.getCellFormula();
                            break;

                        case BOOLEAN:
                            boolean bool = cellval.getBooleanCellValue();
                            if (bool) {
                                data = "True";
                            } else {
                                data = "false";
                            }
                            break;

                        case ERROR :
                            data = cellval.getErrorCellString();
                            break;

                        case _NONE :
                            data = "";
                            break;

                        case BLANK :
                            data = "";

                        default:
                            data = null;

                    }
                    datatable1.put(sheet.getRow(0).getCell(j).getStringCellValue(), data);

                }

                wb.close();

            }
            else{
              // throw new TestCaseOrFlagNotFoundException("Either Test Case Name is not matching or Flag is not set as Y");
            }
        } catch (InvalidFormatException e) {
            throw new RuntimeException(e);
        }


        return datatable1;

    }

    public String getData(String key){
        return datatable1.get(key);
    }
    public void closeWorkBook(){
        try {
            if(getWb()!=null){
                getWb().close();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public  void writeToExcelSheet(String strworkbookname,String outputSheetname,String testCaseName,String outputColumn,String strData) throws IOException, InvalidFormatException {
        prop.load(new FileInputStream( new File(System.getProperty("user.dir")+"\\applicationproperties\\"+"testconfiguration.properties")));
        //workbookname=prop.getProperty("workbookname");
        sheetname=outputSheetname;
        File file=new File(System.getProperty("user.dir")+"\\TestDataSheet\\"+strworkbookname);
        try {
            wb = new XSSFWorkbook(file);
            sheet = wb.getSheet(sheetname);
            int noofrows = sheet.getLastRowNum();
            int colnumber = sheet.getRow(noofrows).getPhysicalNumberOfCells();
            int topRow = sheet.getTopRow();
            int topColNum = sheet.getRow(topRow).getPhysicalNumberOfCells();
            FileOutputStream outputStream=new FileOutputStream(file,true);
            XSSFCell cell;
            int flag=0;
            int testcasenameflag=0;
            for (int i = 1; i <= noofrows; i++) {
                if (sheet.getRow(i).getCell(0).toString().equals(testCaseName)) {  //&& sheet.getRow(i).getCell(1).toString().equals("Y")
                    matchingrow = i;
                    testcasenameflag = 1;
                    // ExtentTestManager.getInstance(test).getTest().log(Status.INFO,String.valueOf("ThreadID matching row is "+Thread.currentThread().getId()));
                    break;
                }
            }
                for(int j=0;j<topColNum;j++){
                    String header=sheet.getRow(0).getCell(j).toString();
                    if(header.equals(outputColumn)){
                        flag=1;
                        cell=sheet.getRow(matchingrow).createCell(j);
                        cell.setCellValue(strData);
                        try {
                           // outputStream=new FileOutputStream(file,true);
                            wb.write(outputStream);
//                            wb.close();
//                            outputStream.close();

                        } catch (FileNotFoundException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    if(header.equalsIgnoreCase("Date") && (flag==1)){
                            cell=sheet.getRow(matchingrow).createCell(j);
                            cell.setCellValue(new Date().toString());
                            try {
                              //  outputStream=new FileOutputStream(file,true);
                                wb.write(outputStream);
//                                wb.close();
//                                outputStream.close();

                            } catch (FileNotFoundException e) {
                                throw new RuntimeException(e);
                            }

                    }
                }
                wb.close();
                outputStream.close();

            if(testcasenameflag==0){
              //  throw new TestCasenotFoundInOuputDataSheet("test Cases is not available in OutputDataSheet");
            }
            if(flag==0){
              //  throw new ColumnNameIsNotFound("Column name is not available");
            }
        }catch (Exception e){
           System.out.println(e.getMessage());
        }
    }

    public  String readFromTestDataSheet(String strworkbookname,String outputSheetname,String testCaseName,String InputColumn) throws IOException, InvalidFormatException
    {
        prop.load(new FileInputStream( new File(System.getProperty("user.dir")+"\\applicationproperties\\"+"testconfiguration.properties")));
        //workbookname=prop.getProperty("workbookname");
        sheetname=outputSheetname;
        String data=null;
        File file=new File(System.getProperty("user.dir")+"\\TestDataSheet\\"+strworkbookname);
        try {
            wb = new XSSFWorkbook(file);
            sheet = wb.getSheet(sheetname);
            int noofrows = sheet.getLastRowNum();
            int colnumber = sheet.getRow(noofrows).getPhysicalNumberOfCells();
            int topRow = sheet.getTopRow();
            int topColNum = sheet.getRow(topRow).getPhysicalNumberOfCells();
            FileOutputStream outputStream;
            XSSFCell cell;
            int flag=0;
            int testcasenameflag=0;

            for (int i = 1; i <= noofrows; i++) {
                if (sheet.getRow(i).getCell(0).toString().equals(testCaseName)) {  //&& sheet.getRow(i).getCell(1).toString().equals("Y")
                    matchingrow = i;
                    testcasenameflag = 1;
                    // ExtentTestManager.getInstance(test).getTest().log(Status.INFO,String.valueOf("ThreadID matching row is "+Thread.currentThread().getId()));
                    break;
                }
            }
            for(int j=0;j<topColNum;j++)
            {
                String header=sheet.getRow(0).getCell(j).toString();
                if(header.equals(InputColumn))
                {
                    flag=1;
                    cellval=sheet.getRow(matchingrow).getCell(j);

                    switch (cellval.getCellType())
                    {
                        case STRING:
                            data = cellval.getStringCellValue();
                            break;

                        case NUMERIC:
                            data = String.valueOf(cellval.getNumericCellValue());
                            break;

                        case FORMULA:
                            data = String.valueOf(cellval.getCellFormula());
                            break;

                        case BOOLEAN:
                            boolean bool = cellval.getBooleanCellValue();
                            if (bool) {
                                data = "True";
                            } else {
                                data = "false";
                            }
                            break;

                        case ERROR :
                            data = cellval.getErrorCellString();
                            break;

                        case _NONE:
                            data = "";
                            break;

                        case BLANK:
                            data = "";

                        default:
                            data = null;


                    }
                    try {
                        wb.close();
                    } catch (FileNotFoundException e) {

                        throw new RuntimeException(e);

                    }
                }
            }


            if(testcasenameflag==0){
              //  throw new TestCasenotFoundInOuputDataSheet("test Cases is not available in OutputDataSheet");
            }
            if(flag==0){
              //  throw new ColumnNameIsNotFound("Column name is not available");
            }

        }catch (Exception e){

            System.out.println(e.getMessage());
        }
        return data;
    }


    public synchronized  Object[][] getDataProviderData(String dataproviderSheetname) throws IOException{
        prop.load(new FileInputStream( new File(System.getProperty("user.dir")+"\\applicationproperties\\"+"testconfiguration.properties")));
        workbookname=prop.getProperty("workbookname");
        sheetname=dataproviderSheetname;
        Object[][]arrayOfData;
        File file=new File(System.getProperty("user.dir")+"\\TestDataSheet\\"+workbookname);
        try {
            wb= new XSSFWorkbook(file);
            sheet=wb.getSheet(sheetname);
            setWb(wb);
            int noofrows=sheet.getLastRowNum();
            int topRow=sheet.getTopRow();
            int topColNum=sheet.getRow(topRow).getPhysicalNumberOfCells();
            arrayOfData= new Object[noofrows][topColNum];
            for (int i=1;i<=noofrows;i++) {
                for (int j = 0; j < topColNum; j++) {
                    cellval = sheet.getRow(i).getCell(j);
                    switch (cellval.getCellType()) {
                        case STRING:
                            data = cellval.getStringCellValue();
                            break;

                        case NUMERIC:
                            data = String.valueOf(cellval.getNumericCellValue());
                            break;

                        case FORMULA:
                            data = cellval.getCellFormula();
                            break;

                        case BOOLEAN:
                            boolean bool = cellval.getBooleanCellValue();
                            if (bool) {
                                data = "True";
                            } else {
                                data = "false";
                            }
                            break;

                        case ERROR:
                            data = cellval.getErrorCellString();
                            break;

                        case _NONE:
                            data = "";
                            break;

                        case BLANK:
                            data = "";
                            break;
                        default:
                            data = null;

                    }
                     arrayOfData[i-1][j]=data;


                }
            }
                wb.close();


        } catch (InvalidFormatException e) {
            throw new RuntimeException(e);
        }


        return arrayOfData;

    }

    public synchronized Iterator<Object[]> getDataProviderAsIterator(String dataproviderSheetname) throws IOException {
        prop.load(new FileInputStream( new File(System.getProperty("user.dir")+"\\applicationproperties\\"+"testconfiguration.properties")));
        workbookname=prop.getProperty("workbookname");
        sheetname=dataproviderSheetname;
        List<Map<String,Object>>listofMaps=new ArrayList<>();
        Map<String,Object> arrayOfData;
        Collection<Object[]>dp=new ArrayList<Object[]>();
        File file=new File(System.getProperty("user.dir")+"\\TestDataSheet\\"+workbookname);
        try {
            wb= new XSSFWorkbook(file);
            sheet=wb.getSheet(sheetname);
            setWb(wb);
            int noofrows=sheet.getLastRowNum();
            int topRow=sheet.getTopRow();
            int topColNum=sheet.getRow(topRow).getPhysicalNumberOfCells();

            for (int i=1;i<=noofrows;i++) {
                arrayOfData= new HashMap<String,Object>();
                for (int j = 0; j < topColNum; j++) {
                    cellval = sheet.getRow(i).getCell(j);
                    switch (cellval.getCellType()) {
                        case STRING:
                            data = cellval.getStringCellValue();
                            break;

                        case NUMERIC:
                            data = String.valueOf(cellval.getNumericCellValue());
                            break;

                        case FORMULA:
                            data = cellval.getCellFormula();
                            break;

                        case BOOLEAN:
                            boolean bool = cellval.getBooleanCellValue();
                            if (bool) {
                                data = "True";
                            } else {
                                data = "false";
                            }
                            break;

                        case ERROR:
                            data = cellval.getErrorCellString();
                            break;

                        case _NONE:
                            data = "";
                            break;

                        case BLANK:
                            data = "";
                            break;
                        default:
                            data = null;

                    }
                    arrayOfData.put(sheet.getRow(0).getCell(j).toString(),data);
                }
                listofMaps.add(arrayOfData);

            }
            wb.close();


        } catch (InvalidFormatException e) {
            throw new RuntimeException(e);
        }
        for (Map<String,Object>map:listofMaps){
            dp.add(new Object[]{map});
        }

        return dp.iterator();

    }



}




package dataDriven;

public class ReadExcelData {

	public static void main(String[] args) {
		
		ExcelDataConfig excel=new ExcelDataConfig("C:\\Users\\vijayalakshmi B\\git\\Datadrivenframework\\TestData\\testData.xlsx");
		
		System.out.println(excel.getData(0, 0, 0));

	}

}

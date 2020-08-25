package dataDriven;

public class ReadExcelData {

	public static void main(String[] args) {
		
		ExcelDataConfig excel=new ExcelDataConfig("C:\\test data\\testdata1.xlsx");
		
		System.out.println(excel.getData(0, 0, 0));

	}

}

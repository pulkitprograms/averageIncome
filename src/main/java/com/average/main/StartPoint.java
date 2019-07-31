/**
 * 
 */
package com.average.main;

import java.io.File;
import java.util.List;

import com.average.api.IdentifyFileType;
import com.average.api.ParseCsvFile;
import com.average.domain.IncomeDetails;

/**
 * @author Pulkit Bajpai
 *
 */
public class StartPoint {

	public static final String INPUT_FILE_PATH = "C:\\files\\Input.csv";
	public static final String CSV = "csv";
	public static final String XLSX = "xlsx";
	public static final String XML = "xml";

	public static void main(String[] args) {

		File inputFile = OpenInputFile(INPUT_FILE_PATH);
		IdentifyFileType identifyFileType = new IdentifyUploadedFileType();
		String fileType = identifyFileType.fileType(inputFile.getName());
		List<IncomeDetails> incomeList = null;
		switch (fileType) {
		case CSV:
			ParseCsvFile parseCSV = new ParseCsvFileImpl();
			incomeList = parseCSV.getIncomeDetailsList(inputFile);
			break;
		case XLSX:
		case XML:
		default: {
			System.out.println("Log: " + inputFile + " file type cannot be processed with this program");
		}

		}
		incomeList.forEach(System.out::println);
		CalculateAverageByCountryByGender CalculateAverageByCountryByGender = new CalculateAverageByCountryByGenderImpl()
	}

	private static File OpenInputFile(String inputFilePath2) {
		if (inputFilePath2.equals(null) && inputFilePath2.isEmpty()) {
			System.out.println("Invalid File Name: Terminating execution");
			System.exit(0);
		}
		return new File(inputFilePath2);
	}

}

/**
 * 
 */
package com.average.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.average.api.ParseCsvFile;
import com.average.domain.Currency;
import com.average.domain.IncomeDetails;

/**
 * @author Pulkit Bajpai
 *
 */
public class ParseCsvFileImpl implements ParseCsvFile {

	public List<IncomeDetails> getIncomeDetailsList(File inputFile) {
		Scanner sc;
		List<IncomeDetails> incomeDetailsList = new ArrayList<>();
		
		try {
			sc = new Scanner(inputFile);
			sc.nextLine();/** To remove headers */
			sc.useDelimiter("[,\n]");
			while (sc.hasNext()) {
				IncomeDetails incomeDetails = new IncomeDetails();
				incomeDetails.setCountry(sc.next());
				incomeDetails.setCity(sc.next());
				incomeDetails.setGender(sc.next());
				incomeDetails.setCurrency(Currency.valueOf(sc.next()));
				incomeDetails.setAverageIncome(Long.parseLong(sc.next()));
				incomeDetailsList.add(incomeDetails);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Failed to parse the CSV file:" + e.getMessage());
		}
		return incomeDetailsList;
	}

}

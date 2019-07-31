/**
 * 
 */
package com.average.api;

import java.io.File;
import java.util.List;

import com.average.domain.IncomeDetails;

/**
 * @author Pulkit Bajpai
 *
 */
public interface ParseCsvFile {

	List<IncomeDetails> getIncomeDetailsList(File inputFile);

}

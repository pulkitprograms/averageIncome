/**
 * 
 */
package com.average.main;

import com.average.api.IdentifyFileType;

/**
 * @author Pulkit Bajpai
 *
 */
public class IdentifyUploadedFileType implements IdentifyFileType {

	public String fileType(String fileName) {
		String fileType= fileName.substring(fileName.lastIndexOf(".")+1);
		return fileType;
		
	}

}

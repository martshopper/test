/**
 * 
 */
package com.main.mart.utilities;

/**
 * @author Hitesh
 *
 */
public class StringUtils {
	public static boolean isNullOrEmpty(String str) {
		boolean status = false;
		if(str == null || str == "" || str.isEmpty() || str == "-1") {
			status = true;
		}
		return status;
	}
}

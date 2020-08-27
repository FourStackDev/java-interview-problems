package org.fourstack.interview.numbers;

import java.util.ArrayList;
import java.util.List;

public class BinaryFormatConvertion {
	
	public static String getBinaryForamtNum(int num) {
		if (num > 0) {
			String binary = "";
			
			while (num > 0) {
				int remainder = num % 2;
				num = num / 2 ;
				
				binary =  remainder + binary;
			}
			
			return binary;
		}
		
		throw new RuntimeException("Number should be positive");
	}
	
	private static int getNumOfDigits(String binaryNum, String typeOfDigit) {
		String tempBinaryNum = binaryNum.replaceAll(typeOfDigit, "");		
		return binaryNum.length() - tempBinaryNum.length();
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static List getBinaryStringAndDigitCount(int num) {
		List list = new ArrayList();
		String binaryForamtNum = getBinaryForamtNum(num);
		list.add(binaryForamtNum);
		list.add(getNumOfDigits(binaryForamtNum, "1"));
		list.add(getNumOfDigits(binaryForamtNum, "0"));
		
		return list;
	}

}

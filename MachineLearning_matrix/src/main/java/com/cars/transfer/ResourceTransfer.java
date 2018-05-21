package com.cars.transfer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import com.cars.matrix.BigDecimalMatrix;
import com.cars.tools.file.FileUtils;

public class ResourceTransfer {
	public static BigDecimalMatrix fileToMatrix(String fileName,String split){
		int yNum = FileUtils.getFileXCount(fileName, split);
		int xNum = FileUtils.getFileLineCount(fileName);
		BigDecimalMatrix result = new BigDecimalMatrix(xNum, yNum-1);
		File file = new File(fileName);
		FileInputStream fis = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			fis = new FileInputStream(file);
			isr = new InputStreamReader(fis,"utf-8");
			br = new BufferedReader(isr);
			String line;
			for(int i = 0;i<xNum;i++){
				line = br.readLine();
				String[] strs = line.split(split);
				for(int j = 0;j<yNum-1;j++){
					result.setElement(i, j, Double.valueOf(strs[j]));
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				br.close();
				isr.close();
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		result.printMatrix();
		return result;
	}
}

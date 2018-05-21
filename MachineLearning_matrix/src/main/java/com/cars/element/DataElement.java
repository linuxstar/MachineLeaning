package com.cars.element;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import com.cars.matrix.BigDecimalMatrix;
import com.cars.matrix.StringArray;

public class DataElement {
	private BigDecimalMatrix featureMatrix;
	private StringArray label;
	
	public DataElement(int xNum,int yNum){
		featureMatrix = new BigDecimalMatrix(xNum, yNum-1);
		label = new StringArray(xNum);
	}
	public void setFeatureLabel(String fileName,String split){
		File file = new File(fileName);
		FileInputStream fis = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			fis = new FileInputStream(file);
			isr = new InputStreamReader(fis,"utf-8");
			br = new BufferedReader(isr);
			String line;
			for(int i = 0;i<featureMatrix.getxNum();i++){
				line = br.readLine();
				String[] strs = line.split(split);
				for(int j = 0;j<featureMatrix.getyNum()+1;j++){
					if(j != featureMatrix.getyNum()){
						featureMatrix.setElement(i, j, Double.valueOf(strs[j]));
					}else{
						label.setElement(i, strs[j]);;
					}
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
	}
	public BigDecimalMatrix getFeatureMatrix() {
		return featureMatrix;
	}
	public void setFeatureMatrix(BigDecimalMatrix featureMatrix) {
		this.featureMatrix = featureMatrix;
	}
	public StringArray getLabel() {
		return label;
	}
	public void setLabel(StringArray label) {
		this.label = label;
	}
	
}

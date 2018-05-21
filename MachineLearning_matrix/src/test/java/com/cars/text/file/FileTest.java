package com.cars.text.file;

import org.junit.Test;

import com.cars.Calculation.MatrixArrayCal;
import com.cars.element.DataElement;
import com.cars.matrix.BigDecimalArray;
import com.cars.tools.file.FileUtils;
import com.cars.transfer.ResourceTransfer;

public class FileTest {
	@Test
	public void TestFileNumber(){
		String fileName="E:\\DeepLeaning\\《机器学习实战》源代码\\machinelearninginaction\\Ch02\\datingTestSet.txt";
		System.out.println(FileUtils.getFileLineCount(fileName));
	}
	@Test
	public void testFileCount(){
		String fileName="E:\\DeepLeaning\\《机器学习实战》源代码\\machinelearninginaction\\Ch02\\datingTestSet.txt";
		System.out.println(FileUtils.getFileXCount(fileName,"\t"));
	}
	@Test
	public void testFileTransfer(){
		String fileName="E:\\DeepLeaning\\《机器学习实战》源代码\\machinelearninginaction\\Ch02\\datingTestSet.txt";
		String split = "\t";
		ResourceTransfer.fileToMatrix(fileName, split);
	}
	@Test
	public void testDataElement(){
		String fileName="E:\\DeepLeaning\\《机器学习实战》源代码\\machinelearninginaction\\Ch02\\datingTestSet.txt";
		String split = "\t";
		int yNum = FileUtils.getFileXCount(fileName, split);
		int xNum = FileUtils.getFileLineCount(fileName);
		DataElement data = new DataElement(xNum, yNum);
		data.setFeatureLabel(fileName, split);
//		data.getFeatureMatrix().printMatrix();
//		data.getLabel().printArray();
	}
	@Test
	public void testCal() throws Exception{
		String fileName="E:\\DeepLeaning\\《机器学习实战》源代码\\machinelearninginaction\\Ch02\\datingTestSet.txt";
		String split = "\t";
		int yNum = FileUtils.getFileXCount(fileName, split);
		int xNum = FileUtils.getFileLineCount(fileName);
		DataElement data = new DataElement(xNum, yNum);
		data.setFeatureLabel(fileName, split);
		BigDecimalArray arr = new BigDecimalArray(3, 3);
		arr.setElement(0, 0.1);
		arr.setElement(1, 1.23);
		arr.setElement(2, 0.2);
		BigDecimalArray result = MatrixArrayCal.matrixMultiplicationArray(arr, data.getFeatureMatrix());
		result.printArray();
	}
}

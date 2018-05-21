package com.cars.Calculation;

import com.cars.matrix.BigDecimalArray;
import com.cars.matrix.BigDecimalMatrix;
/**
 * 数组与矩阵之间的运算
 * @author linuxstar
 *
 */
public class MatrixArrayCal {
	public static BigDecimalArray matrixMultiplicationArray(BigDecimalArray arr,BigDecimalMatrix matr) throws Exception{
		int xNum_matr = matr.getxNum();
		int yNum_matr = matr.getyNum();
		int num = arr.getxNum();
		BigDecimalArray result = new BigDecimalArray(xNum_matr,1);
		if(yNum_matr != num){
			throw new Exception("数组的长度与矩阵的列数不一致，无法进行计算");
		}else{
			for(int i = 0;i < xNum_matr;i++){
				double value = 0.0;
				for(int j = 0;j < yNum_matr;j++){
					value += matr.getElement(i, j) + arr.getElement(j);
				}
				result.setElement(i, value);
			}
		}
		return result;
	}
}

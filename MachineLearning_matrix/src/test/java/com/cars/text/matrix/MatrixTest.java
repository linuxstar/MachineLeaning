package com.cars.text.matrix;

import org.junit.Test;

import com.cars.matrix.BigDecimalMatrix;

public class MatrixTest {
	@Test
	public void matrix(){
		int xNum = 3;
		int yNum = 4;
		BigDecimalMatrix x = new BigDecimalMatrix(xNum, yNum);
		System.out.println(x.getElement(1, 1));
		x.printMatrix();
	}
}

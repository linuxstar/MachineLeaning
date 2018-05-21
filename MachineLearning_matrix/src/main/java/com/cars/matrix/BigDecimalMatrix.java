package com.cars.matrix;

public class BigDecimalMatrix {
	private double [ ][ ] arr;
	private int xNum;
	private int yNum;
	public BigDecimalMatrix(int xNum,int yNum){
		this.xNum = xNum;
		this.yNum = yNum;
		this.arr = new double [xNum][];
		for(int i = 0;i < xNum;i++){
			arr[i] = new double[yNum];
			for(int j = 0;j < yNum;j++){
				arr[i][j] = 0;
			}
		}
	}
	public double getElement(int xIndex,int yIndex){
		double result = arr[xIndex][yIndex];
		return result;
	}
	public void setElement(int xIndex,int yIndex,double value){
		arr[xIndex][yIndex] = value;
	}
	public void printMatrix(){
		for(int i = 0;i < xNum;i++){
			for(int j = 0;j < yNum;j++){
				System.out.print(String.valueOf(this.getElement(i, j))+' ');
			}
			System.out.println();
		}
	}
	public int getxNum() {
		return xNum;
	}
	public void setxNum(int xNum) {
		this.xNum = xNum;
	}
	public int getyNum() {
		return yNum;
	}
	public void setyNum(int yNum) {
		this.yNum = yNum;
	}	
}

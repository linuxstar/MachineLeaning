package com.cars.matrix;

public class BigDecimalArray {
	private double arr[];
	int xNum;
	int type;
	public BigDecimalArray(int xNum,int type){
		this.xNum = xNum;
		this.type = type;
		arr = new double[xNum];
		for(int i = 0;i < xNum;i++){
			arr[i] = 0;
		}
	}
	public double getElement(int xIndex){
		double result = arr[xIndex];
		return result;
	}
	public void setElement(int xIndex,double value){
		arr[xIndex] = value;
	}
	public void printArray(){
		if(this.type == 0){
			for(int i = 0;i < xNum;i++){
				System.out.print(String.valueOf(this.getElement(i))+" ");
			}
		}else{
			for(int i = 0;i < xNum;i++){
				System.out.println(String.valueOf(this.getElement(i)));
			}
		}
	}
	public int getxNum() {
		return xNum;
	}
	public void setxNum(int xNum) {
		this.xNum = xNum;
	}
	
}

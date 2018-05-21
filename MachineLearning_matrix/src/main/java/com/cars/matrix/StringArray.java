package com.cars.matrix;

public class StringArray {
	private String[] arr;
	private int xNum;
	public StringArray(int xNum){
		this.xNum = xNum;
		arr = new String[xNum];
		for(int i = 0;i < xNum;i++){
			arr[i] = " ";
		}
	}
	public String getElement(int index){
		String result = arr[index];
		return result;
	}
	public void setElement(int index,String value){
		arr[index] = value;
	}
	public void printArray(){
		for(int i = 0;i < xNum;i++){
			System.out.println(arr[i]);
		}
	}
	public String[] getArr() {
		return arr;
	}
	public void setArr(String[] arr) {
		this.arr = arr;
	}
	public int getxNum() {
		return xNum;
	}
	public void setxNum(int xNum) {
		this.xNum = xNum;
	}
	
}

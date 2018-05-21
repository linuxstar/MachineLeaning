package com.cars.tools.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

/**
 * 对文件的一些操作
 * @author linuxstar
 *
 */
public class FileUtils {
	public static int getFileLineCount(String fileName){
		int line = 0;
		LineNumberReader reader = null;
		try {
			reader = new LineNumberReader(new FileReader(fileName));
			String lineRead="";
			while((lineRead = reader.readLine())!=null){
			}
			line = reader.getLineNumber();
		} catch (Exception e) {
			line = -1;
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return line;
	}
	public static int getFileXCount(String fileName,String split){
		int count = 0;
		File file = new File(fileName);
		FileInputStream fis = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			fis = new FileInputStream(file);
			isr = new InputStreamReader(fis,"utf-8");
			br = new BufferedReader(isr);
			String line = br.readLine();
			count = line.split(split).length;
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
		return count;
	}
}

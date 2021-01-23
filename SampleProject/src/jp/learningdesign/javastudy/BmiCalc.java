package jp.learningdesign.javastudy;

import java.util.Scanner;
public class BmiCalc {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		double weight,height,bmi;
		
		weight = 72;
	    height = 172;
	    height /=100;
	    bmi = weight/(height*height);
	    
	    System.out.println(bmi);
	
	    if(bmi < 18.5) {
	    	System.out.println("やせ型です");
	    } else if (bmi < 25) {
	    	System.out.println("標準です");
	    } else {
	    	System.out.println("肥満です");
	    }
	}
}

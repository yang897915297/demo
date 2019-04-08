package test;

import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入您要转换的华氏温度");
		double of = sc.nextDouble();
		double oc = (of-32)*5/9;
		System.out.println("转换后的摄氏度为："+oc);
	}

}

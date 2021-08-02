/*

package com.java.phone;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.ModuleLayer.Controller;
import java.util.ArrayList;

public class PhoneEx {
	ArrayList<aaa> tel = new ArrayList<aaa>(); 
	//Phone의 데이터를 가지는 ArrayList의 변수를 tel이라고 만들고 
	//Phone의 데이터를 가지는 ArrayList의 객체를 만들어서 변수 tel에 대입 
	
	Controller c = new Controller();	 //Controller 라는 클래스 변수 이름을 c로 하고 Controller 객체를 생성해서 대입 
	File f = new File("C:\\Phonenumber\\phone.txt"); 
	
	if(f.exists()) { 
		tel.clear(); 	//ArrayList tel의 내용 클리어해서 tel을 비움 
	fr = new FileReader("C:\\Phonenumber\\phone.txt"); 	//FileReader fr에 FileReader 객체를 생성 생성자 인자에는 파일경로를 문저열로 넣어서 객체 생성 
	BufferedReader reader1 = new BufferedReader(fr);	 // BufferReader reader1에 BufferedReader 객체를 생성 생성자 인자에는 FileReader을 넣어서 객체 생성 
	
	String line1; //문자열 line1 생성 
	String[] splitLine1 = null;	 //문자열 배열 splitLine을 생성 하고 null 값 대입 
	
	while((line1=reader1.readLine()) != null)	 //BufferReader reader1을 이용해 한줄을 읽어 와서 문자열 line1에 대입하고 line1이 널이 아니면 반복 
		{ //
		System.out.println(line1); 
		splitLine1 = line1.split("\t\t"); 		//문자열 splitLine 배열에 line1을 "\t\t"로 자른 문자열들을 대입 // 
		System.out.println(splitLine.length); tel.add(new Phone(splitLine1[0], splitLine1[1], splitLine1[2])); //ArrayList tel 추가할때 Phone 객체를 생성 하고 생성자는 문자열 splitLine1 배열을 대입 
		} }
		}
	}
	
	*/


package com.java.phone;

import java.io.File;
import java.io.IOException;

public class PhoneApp {
	static final String rootPath = System.getProperty("user.dir") + "\\PhoneBook\\";	//	프로젝트 + 파일 위치 확인

	public static void main(String[] args) {

		File root = new File(rootPath);
		if (!root.exists()) {
			root.mkdirs();
		}
			//	데이터 파일 생성
			File newFile = new File(rootPath + "PhoneData.txt");
			if (!newFile.exists()) {
				try {
					newFile.createNewFile();
				} catch (IOException e) {
					e.printStackTrace(); 
				}
			
			
			
			//	데이터 등록
			
			
			
			
			//	출력
			//	파일 내용 조회, 수정, 삭제
		}
	}

}

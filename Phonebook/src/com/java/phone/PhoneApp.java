package com.java.phone;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class PhoneApp {
	static final String rootPath = System.getProperty("user.dir") + "\\PhoneBook\\";
	static String source = rootPath + "PhoneData.txt";
	public static void main(String[] args) {
		
		//	선언
		List<Phone> lst = new ArrayList<>();
		run(lst);
	}
		//	실행부
		private static void run(List<Phone> lst) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("*********************************************");
			System.out.println("*           전화번호 관리 프로그램                *");
			System.out.println("*********************************************");
			
			boolean run = true;
			int code = 0;
			
			while(run) {
				System.out.println("1.리스트 2.등록 3.삭제 4.검색 5.종료");
				System.out.println("---------------------------------------------");
				System.out.print(">메뉴번호: ");
				code = sc.nextInt();
				System.out.println();
				
			
				switch (code) {
				case 1:
					System.out.println();
					System.out.println("<1.리스트>");
					showInfo(lst);
					System.out.println();
						
				case 2:
					System.out.println();
					add(sc, lst);
						
				case 3:
					System.out.println();
					
					
				case 4:
					System.out.println();
					System.out.println("<4. 검색>");
					System.out.print("이름 >> ");
					serchstr = sc.next();
					search(person, serchstr);
					System.out.println();
					break;
					
					
				case 5:
					System.out.println();
					System.out.println("*********************************************");
					System.out.println("*                  감사합니다                  *");
					System.out.println("*********************************************");
						run = false;
						break;
				}
			}	
		
		}
		//	검색
		private static void search(List<Phone> lst, String str) {
			
		}
		
		//	리스트에 추가
		private static void add(Scanner sc, List<Phone> lst) {
			System.out.print("이름: ");
			lst.setName = sc.next();
			
		}
		//	리스트 출력
		private static void showInfo(List<Phone> lst) {
			Iterator<Phone> iter = lst.iterator();
			while(iter.hasNext()) {
				Phone item = iter.next();	
				System.out.print(item);
			}
		}
		
	
	}



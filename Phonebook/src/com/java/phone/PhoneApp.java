package com.java.phone;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PhoneApp {
	static final String rootPath = System.getProperty("user.dir") + "\\PhoneBook\\";
	static String source = rootPath + "PhoneData.txt";
	public static void main(String[] args) throws IOException {

		//	선언
		List<Phone> lst = new ArrayList<>();
		FileRead(lst);
		run(lst);
		
	}
		
		
    //	실행부
		private static void run(List<Phone> lst) {
			
			System.out.println("*********************************************");
			System.out.println("*           전화번호 관리 프로그램                *");
			System.out.println("*********************************************");
			
			boolean run = true;
			int code = 0;
			String word = "";
			
			while(run) {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("1.리스트 2.등록 3.삭제 4.검색 5.종료");
				System.out.println("---------------------------------------------");
				System.out.print(">메뉴번호: ");
				try {
					code = Integer.parseInt(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				} 
				
				System.out.println();
				
			
				switch (code) {
				case 1:
					System.out.println();
					System.out.println("<1.리스트>");
					showInfo(lst);
					System.out.println();
					break;
						
				case 2:
					System.out.println();
					System.out.println("<2.등록>");
					add(br, lst);
					break;
						
				case 3:
					System.out.println();
					System.out.println("<3.삭제>");
					System.out.println(">번호: ");
					del(br, lst);
					break;
					
					
				case 4:
					System.out.println();
					System.out.println("<4.검색>");
					System.out.print(">이름: ");
					try {
						word = br.readLine();
					} catch (IOException e) {
						e.printStackTrace();
					}
					search(lst, word);
					System.out.println();
					break;
					
					
				case 5:
					System.out.println();
					System.out.println("*********************************************");
					System.out.println("*                  감사합니다                  *");
					System.out.println("*********************************************");
					run = false;
					break;
				
				default:
					System.out.println("[다시 입력해 주세요.]");
					System.out.println();
				}
			}
		}
		
		//	검색
		private static void search(List<Phone> lst, String str) {
			BufferedReader br = 
					new BufferedReader(new InputStreamReader(System.in));
			
			String Info = "";
			try {
				while((str = br.readLine()) != null) {	
					if (Info.contains(str)) {
						System.out.println(Info);
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					br.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		//	리스트에 추가
		private static void add(BufferedReader br, List<Phone> lst) {
			String name;
			String hp;
			String tel;
			
			try {
				System.out.print("이름: ");
				name = br.readLine();
				System.out.print("휴대전화: ");
				hp = br.readLine();
				System.out.print(">집전화: "	);
				tel = br.readLine();
				lst.add(new Phone(name, hp, tel));
				System.out.println();
				System.out.println("[등록되었습니다.]");
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		//	리스트에서 삭제
		private static void del(BufferedReader br, List<Phone> lst) {
			int d = 0;
			try {
				d = br.read();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					br.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			lst.remove(d - 1);
//			update(lst);
			System.out.println();
			FileWirte(lst);
			System.out.println("[삭제되었습니다.]");
		}
		
		//	리스트 출력
		private static void showInfo(List<Phone> lst) {
//			for (int i = 0; i < lst.size(); i++) {
//				System.out.println(lst.get(i).toString());
			int i = 1;
			Iterator<Phone> iter = lst.iterator();
			while(iter.hasNext()) {
				Phone item = iter.next();
				System.out.print(i + ". ");
				System.out.println(item);
				i++;
			}
		}
		
		// 넘버링
//		private static void update(List<Phone> lst) {
//			for (int i = 0; i < lst.size(); i++) {
//				Phone n = (Phone) lst.get(i);
//				n.setNum(i + 1);
//			}
//		}
//		
		//	파일 입출력
		private static void FileRead(List<Phone> lst) {
			Reader fr = null;
			BufferedReader br = null;
			try {
				fr = new FileReader(source);
				br = new BufferedReader(fr);
				String line = "";
				String[] words = new String[3];
				while ((line = br.readLine()) != null) {
					words = line.split(",");
					lst.add(new Phone(words[0], words[1], words[2]));
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					br.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
//			update(lst);
			return;
		}
		
		private static void FileWirte(List<Phone> lst) {
			Writer fw = null;
			BufferedWriter bw = null;
			try {
				fw = new FileWriter(source);
				bw = new BufferedWriter(fw);
				
				for(int i = 0; i < lst.size(); i++) {
					Phone wrPhone = lst.get(i);
					bw.write(wrPhone.getName() + ",");
					bw.write(wrPhone.getHp() + ",");
					bw.write(wrPhone.getTel());
					bw.write("\r\n");
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					bw.flush();
					bw.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
//		private static void update(List<Phone> lst) {
//				
//		}

	
	}

		


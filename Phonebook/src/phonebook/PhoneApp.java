package phonebook;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class PhoneApp {

	public static void main(String[] args) {

		run();
		
		}
	
	private static void searchPhoneBook(Scanner sc) {
		System.out.print(">검색어: ");
		String keyword = sc.next();
		
		PhoneBookDAO dao = new PhoneBookDAOImpl();
		
		List<PhoneBookVO> list = dao.search(keyword);
		
		Iterator<PhoneBookVO> it = list.iterator();
		
		while(it.hasNext()) {
			PhoneBookVO vo = it.next();
			System.out.printf("%d.%s\t%s\t%s%n",
					vo.getId(),
					vo.getName(),
					vo.getHp(),
					vo.getTel());
		}
		
	}
	
	private static void deletePhoneBook(Scanner sc) {
		System.out.print(">번호: ");
		long id = sc.nextLong();
		
		PhoneBookDAO dao = new PhoneBookDAOImpl();
		
		boolean success = dao.delete(id);
		
		System.out.println("전화번호 삭제: " + (success ? "성공" : "실패"));
	}
	
	private static void updatephoneBook(Scanner sc) {
		System.out.print(">ID: ");
		long id = sc.nextLong();
		System.out.print(">이름: ");
		String name = sc.next();
		System.out.print(">휴대전화: ");
		String hp = sc.next();
		System.out.print(">집전화: ");
		String tel = sc.next();
		
		PhoneBookVO vo = new PhoneBookVO(id, name, hp, tel);
		
		PhoneBookDAO dao = new PhoneBookDAOImpl();
		
		boolean success = dao.update(vo);
		
		System.out.println("전화번호 수정: " + (success ? "성공" : "실패"));
	}
	
	private static void insertPhoneBook(Scanner sc) {
		System.out.print(">이름: ");
		String name = sc.next();
		System.out.print(">휴대전화: ");
		String hp = sc.next();
		System.out.print(">집전화: ");
		String tel = sc.next();
		
		PhoneBookVO vo = new PhoneBookVO(name, hp, tel);
		
		PhoneBookDAO dao = new PhoneBookDAOImpl();
		
		boolean success = dao.insert(vo);
		System.out.println("전화번호 등록: " + (success ? "성공" : "실패"));
	}
	
	private static void listPhoneBook() {
		
		PhoneBookDAO dao = new PhoneBookDAOImpl();
		
		List<PhoneBookVO> list = dao.getList();
		Iterator<PhoneBookVO> it = list.iterator();
		
		while(it.hasNext()) {
			PhoneBookVO vo = it.next();
			System.out.printf("%d. %s\t%s\t%s%n",
					vo.getId(),
					vo.getName(),
					vo.getHp(),
					vo.getTel());
		}
	}
	
    //	실행부
		private static void run() {
			
			System.out.println("*********************************************");
			System.out.println("*           전화번호 관리 프로그램                *");
			System.out.println("*********************************************");
			
			Scanner sc = new Scanner(System.in);
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
					listPhoneBook();
					System.out.println();
					break;
						
				case 2:
					System.out.println();
					System.out.println("<2.등록>");
					insertPhoneBook(sc);
					break;
						
				case 3:
					System.out.println();
					System.out.println("<3.삭제>");
					deletePhoneBook(sc);
					break;
					
					
				case 4:
					System.out.println();
					System.out.println("<4.검색>");
					searchPhoneBook(sc);
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
			sc.close();
		}
		
}
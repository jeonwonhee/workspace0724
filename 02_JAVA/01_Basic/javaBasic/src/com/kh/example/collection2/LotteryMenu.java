package com.kh.example.collection2;
import java.util.Scanner;
import java.util.Objects;
public class LotteryMenu {
	private Scanner sc = new Scanner(System.in);
	private LotteryController lc = new LotteryController();
	
	//메인 메뉴 반복 출력 및 분기
	public void mainMenu() {
		System.out.println("========== KH 추첨 프로그램 ==========");
		while(true) {
			System.out.print(" ***** 메인 메뉴 *****");
			System.out.println("1. 추첨 대상 추가");
			System.out.println("2. 추첨 대상 삭제");
			System.out.println("3. 추첨 대상 확인");
			System.out.println("4. 정렬된 당첨 대상 확인");
			System.out.println("5. 당첨 대상 검색");
			System.out.println("9. 종료");
			System.out.println("메뉴 번호 입력");
			
			int num = sc.nextInt();
			sc.nextLine();
			
			switch(num) {
			case 1:
				insertObject();
				break;
			case 2:
				deleteObject();
				break;
			case 3:
				winObject();
				break;
			case 4:
				sortedWinObject();
				break;
			case 5:
				searchWinner();
				break;
			case 9:
				System.out.println("프로그램 종료");
				break;
			default:
				System.out.println("다시 입력하세요");
				return;
					
			}
			System.out.println();
			
		}
		
	}
	
	// N명 일괄 추가(중복 시 재입력 유도)
	public void insertObject() {
		System.out.println("추가할 추첨 대상 수 :");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < num2; i++) {
			System.out.println("이름 : ");
			String name = sc.nextLine();
			
			System.out.println("핸드폰 번호('-'빼고) : ");
			String phone = sc.nextLine();
			
			boolean isInsert = lc.insertObject(new Lottery(name, phone));
			if(!isInsert) {
				System.out.println("다시 입력해주세여 : ");
				i--;
			}
		}
		System.out.println(num2 + "명 추가 완려되어ㅓㅆ습니다.");
	}
	
	//대상 삭제 결과 출력
	public void deleteObject() {
		System.out.println("삭제할 대상의 이름과 핸드폰 번호를 입력하세요: ");
		System.out.println("이름: ");
		String name = sc.nextLine();
		
		System.out.println("핸드폰 번호('-'빼고) : ");
		String phone = sc.nextLine();
		
		boolean isRemove = lc.deleteObject(new Lottery(name, phone));
		if(isRemove) {
			System.out.println("삭제 완료 되었습니다.");
		}else {
			System.out.println("존재하지 않는 대상입니다.");
		}
		
		
			
	}
	
	//당첨 목록(Set) println으로 출력
	public void winObject() {
		
	}
	
	//정렬된 당첨 목록을 Iterator로 출력
	public void sortedWinObject() {
		
	}
	
	//당첨자 검색 결과 출력
	public void searchWinner() {
		System.out.println("검색할 대상의 이름과 핸드폰 번호를 입력하세요: ");
		System.out.println("이름: ");
		String name = sc.nextLine();
		
		System.out.println("핸드폰 번호('-'빼고) : ");
		String phone = sc.nextLine();
		
		boolean isWin = lc.searchWinner(new Lottery(name, phone));
		if(isWin) {
			System.out.println("ㅊㅋ");
			
		}else {
			System.out.println("ㄲㅂ");
		}
	}

}

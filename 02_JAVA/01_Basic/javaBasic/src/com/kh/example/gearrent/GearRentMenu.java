package com.kh.example.gearrent;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class GearRentMenu {
	
	//필드
	Scanner sc = new Scanner(System.in);
	GearRentController gc = new GearRentController();
	
	//메서드
	public void mainMenu() {
		while(true) {
			System.out.println("=== KH 장비 대여 관리 ===");
			System.out.println("1) 장비등록 2) 회원등록 3) 대여 4) 반납 5) 태그검색");
			System.out.println("6) 키워드검색 7) "
					+ "전체장비 8) 대여중목록 9) 종료");
			System.out.println("메뉴 : ");
			int n1 = sc.nextInt();
			sc.nextLine();
			
			switch(n1) {
			case 1: addDevice(); break;
			case 2: addMember(); break;
			case 3: borrow(); break;
			case 4: returnItem(); break;
			case 5: findByTag(); break;
			case 6: findByKeyword(); break;
			case 7: printAllDevices(); break;
			case 8: printActiveLoans(); break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다리 입력해주세요.");
				return;	
			}
			System.out.println();
			
		}
	}
	
	public void addDevice() {
		System.out.print("유형(1:Camera, 2:Laptop): ");
		int num2 = sc.nextInt();
		
		System.out.println("id: ");
    	String id = sc.next();
    	
    	System.out.println("name: ");
    	String name = sc.next();
    	
    	System.out.println("category: ");
    	String category = sc.next();
    	
    	System.out.println("tag: ");
    	String tag = sc.next();
    	sc.nextLine();
    	
		Set<String> tags = new HashSet<>();
		for(String s : tag.split(",")) {
			tags.add(s.trim());
		}
		
		Device device;
		switch(num2) {
		case 1:
			device = new Camera(id,name,category,tags);
			break;
		case 2:
			device = new Camera(id,name,Laptop,tags);
			break;
		default:
			System.out.println("유형을 잘못 입력하셨습니다.");
			return;
		
		}
		boolean isOk = gc.addDevice(device);
		System.out.println(isOk ? "등록완료" : "중복된 ID입니다. 다시 입력해주세요");
	}
	
    public void addMember() {
    	System.out.println("member id: ");
    	String id = sc.next();
    		
    	System.out.println("name: ");
    	String name = sc.next();
    	sc.nextLine();
    	
    	boolean isOk =gc.addMember(new Member(id,name));
    	System.out.println(isOk ? "가입완료" : "중복된 ID입니다. 다시 입력해주세요");

		
	}

    public void borrow() {
    	System.out.println("memberId : ");
    	String id = sc.next();
    	
    	System.out.println("itemId : ");
    	String item = sc.next();
    	
    	System.out.println("대여일(YYYY-MM-DD): ");
    	String day = sc.next();
    	sc.nextLine(); 
    	
    	LocalDate today = LocalDate.parse(day);
    	
    	Loan loan = gc.borrow(id, item, today);
    	if(loan == null) {
    		System.out.println("대여가 불가한 장비입니다.");
    		return;
    	}
    	System.out.println("대여 생성 완료 : " + loan);
    	System.out.println("반납 예정일 : " + loan.getDueDate());
    	
    }

   public void returnItem() {
	System.out.println("itemId : ");
   	String item = sc.next();
   	
   	System.out.println("반납일(YYYY-MM-DD): ");
   	String day = sc.next();
   	sc.nextLine(); 
   	
   	LocalDate today = LocalDate.parse(day);
   	
   	int fee = gc.returnItem(item, today);
   	
   	if(fee = -1) {
   		System.out.println("대여이력이 없습니다.");
   	} else {
   		System.out.println("반납 완료, 연체료 : " + fee + "원");
   	}
    }

    public void findByTag() {
	System.out.println("검색 태그: ");
	String tag = sc.next();
	List<Device> list = gc.findByTag(tag);
	if(list.isEmpty()) {
		System.out.println("결과없음");
	}else {
		for(Device d : list) {
			System.out.println(d);
		}
	}
   }

   public void findByKeyword() {
	System.out.println("키워드 : ");
	String keyword = sc.next();
	List<Device> list = gc.findByKeyword(keyword);
	if(list.isEmpty()) {
		System.out.println("결과없음");
	}else {
		for(Device d : list) {
			System.out.println(d);
		}
	}
   }
   
   
   public void printAllDevices() {
    Collection<Device> all = gc.getAllDevices();
    if(all.isEmpty()) {
		System.out.println("결과없음");
	}else {
		for(Device d : all) {
			System.out.println(d);
    }
	}
   }
   
   public void printActiveLoans() {   // 세미콜론 제거
	    Collection<Loan> all = gc.getAllActiveLoans(); // <- Loan 목록 가져오기
	    if (all.isEmpty()) {
	        System.out.println("결과없음");
	    } else {
	        for (Loan l : all) {
	            System.out.println(l);
	        }
	    }
	}}
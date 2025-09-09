package com.kh.example.gearrent;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class GearRentController {

	//필드
	 private HashMap<String, Device> catalog = new HashMap<>();
	 private HashMap<String,Member> members = new HashMap<>();
	 private HashMap<String, Loan> activeLoans = new HashMap<>();
	 
	 //장비등록
	 public boolean addDevice(Device device) {
	        if (catalog.containsKey(device.getId())) {
	            return false;
	        }
	        catalog.put(device.getId(), device);
	        return true;
	    }
	 
	 //회원등록
	 public boolean addMember(Member member) {
		 if (members.containsKey(member.getId())) {
	            return false;
	        }
		 members.put(member.getId(), member);
	        return true;
	    }
	 
	 //장비생성
	 public Loan borrow(String memberId, String itemId, LocalDate today) {
		 Device device = catalog.get(itemId);
		 if(device == null) return null;
		 
		 LocalDate due = today.plusDays(device.getBorrowLimitDays());
		 Loan loan = new Loan(itemId, memberId, today, due);
		 if(activeLoans.containsKey(itemId)) return null;
		 
		 activeLoans.put(itemId,loan);
		 device.increaseBorrowCount();
		 return loan;
	 }
	 
	 //반납처리
	 public int returnItem(String itemId, LocalDate today) {
		 Loan loan = activeLoans.get(itemId);
		 
		 loan.setReturnedDate(today); // 실제 반납일
		 int overdueDay = loan.overdueDays(today);
		 Device device = catalog.get(itemId);
		 int fee = device.calcLateFee(overdueDay); //연체료
		 activeLoans.remove(itemId);
		 
		 return fee;
	 }
	 
	 //태그검색
	 public ArrayList<Device> findByTag(String tag){
		 ArrayList<Device> list = new ArrayList<>();
		 
		 if(tag == null) return null;
		 
		 for(Device d : catalog.values()) {
			 if(d.hasTag(tag)) {
				 list.add(d);
			 }
		 }
		 return list;
	 }
	 
	 //키워드검색
	 public ArrayList<Device> findByKeyword(String keyword){
         ArrayList<Device> list = new ArrayList<>();
		 
		 if(keyword == null || keyword.equals(" ")) return list;
		 
		 String key = keyword.toLowerCase();
		 
		 for(Device d : catalog.values()) {
			 String name = d.getName().toLowerCase();
			 String cat = d.getCategory().toLowerCase();
			 if(name.contains(key) || cat.contains(key)) {
				 list.add(d);
			 }
		 }
		 return list;
	 }
	 
	 //전체 장비 조회
	 public Collection<Device> getAllDevices(){
		 //읽기전용뷰를 만들어준다 -> 추가/삭제/수정 불가
		
	 //return Collections.unmodifiableCollection(catalog.values());
		 return catalog.values();
	 }
	 
	 
	 //대여중 목록 조회
	 public Collection<Loan> getActiveLoans(){
		 return activeLoans.values();
	 }
	 
}

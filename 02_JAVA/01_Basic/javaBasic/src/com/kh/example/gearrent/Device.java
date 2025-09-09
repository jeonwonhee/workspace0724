package com.kh.example.gearrent;

import java.util.Objects;
import java.util.HashSet;
import java.util.Set;

public abstract class Device {
	//필드
	private String id;
	private String name;
	private String category;
	private int borrowCount;
	 private Set<String> tags;
	
	 //생성자
	 public Device(String id, String name, String category, Set<String> tags) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.tags = (tags != null) ? new HashSet<>(tags) : new HashSet<>();
	 }  
	 
	//추상 메서드 유형별 대여 가능 일수
	 public abstract int getBorrowLimitDays();
	 public abstract int calcLateFee(int overdueDays);
	 
	 //구현메서드
	 public void  increaseBorrowCount() {
		 this.borrowCount++;
	 }
	 
	 public boolean hasTag(String tag) {
		 if (tag == null) return false;

		    String lowerTag = tag.toLowerCase(); 
		    for (String t : tags) {
		     if (t != null && t.toLowerCase().equals(lowerTag)) {
		            return true;
		        }
		    }
		    return false;
	 }

	 //Getter Setter
	 public String getId() {
		 return id;
	 }

	 public void setId(String id) {
		 this.id = id;
	 }

	 public String getName() {
		 return name;
	 }

	 public void setName(String name) {
		 this.name = name;
	 }

	 public String getCategory() {
		 return category;
	 }

	 public void setCategory(String category) {
		 this.category = category;
	 }

	 public int getBorrowCount() {
		 return borrowCount;
	 }

	 public void setBorrowCount(int borrowCount) {
		 this.borrowCount = borrowCount;
	 }

	 public Set<String> getTags() {
		 return tags;
	 }

	 public void setTags(Set<String> tags) {
		 this.tags = tags;
	 }

	 //equals()/hashCode()
	 @Override
	 public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	 }

	 @Override
	 public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	 }

	 //toString()
	 @Override
	 public String toString() {
		// TODO Auto-generated method stub
		 return "Device{" +
         "id='" + id + '\'' +
         ", name='" + name + '\'' +
         ", category='" + category + '\'' +
         ", borrowCount=" + borrowCount +
         ", tags=" + tags +
         '}';
	 }
	 
	
	 
	
}

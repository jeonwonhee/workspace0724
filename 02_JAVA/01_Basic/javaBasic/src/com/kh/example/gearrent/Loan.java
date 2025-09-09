package com.kh.example.gearrent;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Loan {
	
	private String itemId;
	private String memberId;
	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public LocalDate getLoanDate() {
		return loanDate;
	}

	public void setLoanDate(LocalDate loanDate) {
		this.loanDate = loanDate;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public LocalDate getReturnedDate() {
		return returnedDate;
	}

	public void setReturnedDate(LocalDate returnedDate) {
		this.returnedDate = returnedDate;
	}

	private LocalDate loanDate;
	private LocalDate dueDate;
	private LocalDate returnedDate;
	
	public Loan(String itemId, String memberId, LocalDate loanDate, LocalDate dueDate) {
		super();
		this.itemId = itemId;
		this.memberId = memberId;
		this.loanDate = loanDate;
		this.dueDate = dueDate;
	}
	
	public boolean isOverdue(LocalDate today) {
        LocalDate day = (returnedDate != null) ? returnedDate : today;
        return day.isAfter(dueDate); // 반납일/오늘이 예정일 이후면 연체
	}
	
	public int overdeuDays(LocalDate today) {
		LocalDate day = (returnedDate != null) ? returnedDate : today;
		
        if(day.isAfter(dueDate)) {
        	long days = ChronoUnit.DAYS.between(dueDate, day);
        	
        	return (int)days;
        }
        return 0;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}

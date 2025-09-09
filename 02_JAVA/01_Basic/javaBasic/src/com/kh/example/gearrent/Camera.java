package com.kh.example.gearrent;

import java.util.Set;

public class Camera extends Device{

	//생성자
	public Camera(String id, String name, String category, Set<String> tags) {
		super(id, name, category, tags);
	}
	
	public int getBorrowLimitDays() {
        return 14; // 
    }

    @Override
    public int calcLateFee(int d) {
        return 500 * d; // 연체료: 하루당 500원
    }

}

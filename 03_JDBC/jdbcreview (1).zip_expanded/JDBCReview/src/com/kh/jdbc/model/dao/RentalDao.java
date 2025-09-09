package com.kh.jdbc.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Properties;

import com.kh.jdbc.model.vo.Rental;

public class RentalDao {
	private Properties prop = new Properties();
	
	public RentalDao(Properties prop) {
		super();
		prop.loadFromXML("resources/rental-query.xml");
	}

	public int rentBook(Rental r, Connection conn) {
		//insert -> int(처리된 행 수)
		int result =0;
		PreparedStatement pstmt = null;	
		
		String sql
	}

}

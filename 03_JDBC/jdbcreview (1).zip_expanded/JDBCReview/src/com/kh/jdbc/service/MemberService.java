package com.kh.jdbc.service;

import static com.kh.jdbc.common.JDBCTemplate.close;

import java.sql.Connection;
import java.util.List;

import com.kh.jdbc.common.JDBCTemplate;
import com.kh.jdbc.model.dao.MemberDao;
import com.kh.jdbc.model.vo.Member;

public class MemberService {
	
	public List<Member> selectAllMemberList(){
		Connection conn = JDBCTemplate.getConnection();
		
		List<Member> list = new MemberDao().selectAllMembers(conn);
		
		close(conn);
		return list;
	}

	
}

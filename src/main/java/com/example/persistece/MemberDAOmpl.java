package com.example.persistece;


import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.example.domain.MemberVO;

@Repository
public class MemberDAOmpl {
	public class MamberDAOI implements MemberDAO{
		private SqlSession session;
		private static final String namespace= "*memberMapper";
	
		
		
		@Override
		public List<MemberVO> list(){
			return session.selectList(namespace + ".list");
		}
		@Override
		public void insert(MemberVO vo){
			
		}
		
		
	}
}

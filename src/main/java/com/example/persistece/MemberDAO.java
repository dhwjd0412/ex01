package com.example.persistece;


import java.util.List;

import com.example.domain.MemberVO;

public interface MemberDAO {

	public List<MemberVO> list();
	public void insert(MemberVO vo);
	
}

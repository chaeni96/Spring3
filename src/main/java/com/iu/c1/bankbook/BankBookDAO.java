package com.iu.c1.bankbook;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BankBookDAO {

	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.iu.c1.bankbook.BankBookDAO.";
	
	public int setInsert(BankBookDTO bankBookDTO) {
		 return sqlSession.insert(NAMESPACE+"setInsert", bankBookDTO);
	}
	
	public List<BankBookDTO> getList(){
		return sqlSession.selectList(NAMESPACE+"getList");
	}
	
	
	//상품 상세 조회
	public BankBookDTO getSelect(BankBookDTO bankBookDTO) {	
		return sqlSession.selectOne(NAMESPACE+"getSelect", bankBookDTO);
	}
	
	
	
	
}

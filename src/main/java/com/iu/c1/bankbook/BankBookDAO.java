package com.iu.c1.bankbook;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iu.c1.util.Pager;

@Repository
public class BankBookDAO {

	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.iu.c1.bankbook.BankBookDAO.";
	
	public int setInsert(BankBookDTO bankBookDTO) {
	
		 return sqlSession.insert(NAMESPACE+"setInsert", bankBookDTO);
	}
	
	public List<BankBookDTO> getList(Pager pager){
		return sqlSession.selectList(NAMESPACE+"getList", pager);
	}
	
	
	//상품 상세 조회
	public BankBookDTO getSelect(BankBookDTO bankBookDTO) {	
		return sqlSession.selectOne(NAMESPACE+"getSelect", bankBookDTO);
	}
	
	public int setDelete(Long bookNumber) {
		return sqlSession.delete(NAMESPACE+"setDelete", bookNumber);
	}
	
	public int setUpdate(BankBookDTO bankBookDTO) {
		return sqlSession.update(NAMESPACE+"setUpdate", bankBookDTO);
	}
	
	public Long getCount(Pager pager) {
		return sqlSession.selectOne(NAMESPACE+"getCount", pager );
	}
}

package com.iu.c1.bankbook;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Random;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.iu.c1.MyJunitTest;
import com.iu.c1.util.Pager;

public class BankBookDAOTest extends MyJunitTest{

	@Autowired
	private BankBookDAO bankBookDAO;
	
	
	
	//@Test
	public void getSelectTest() {
		BankBookDTO bankBookDTO = new BankBookDTO();
		bankBookDTO.setBookNumber(7);
		bankBookDTO = bankBookDAO.getSelect(bankBookDTO);
		//System.out.println(bankBookDTO.getBookName());
		assertNotNull(bankBookDTO);
	}
	
	//@Test
	public void getListTest(Pager pager, Long totalCount) {
		List<BankBookDTO> ar = bankBookDAO.getList(pager);
		pager.setPn(1L);
		pager.makeNum(211L);
		pager.makeRow();
		assertNotEquals(0, ar.size());	
	}
	
	//@Test
	public void setInsertTest() throws Exception{
		Random random = new Random();
		
		for(int i = 0; i<200; i++) {
			BankBookDTO bankBookDTO = new BankBookDTO();
			bankBookDTO.setBookName("BookName"+i);
			int rate = random.nextInt(400);
			bankBookDTO.setBookRate(rate/100.0);
			bankBookDTO.setBookSale(random.nextInt(2));
			int result = bankBookDAO.setInsert(bankBookDTO);
			
			if(i%10==0) {
				Thread.sleep(500);
			}
		}
		
		System.out.println("Finish ==================");
			
	}
	
	//@Test
	public void setDeleteTest() {
		
		int result = bankBookDAO.setDelete(29L);
		assertEquals(1, result);
		
	}
	
	//@Test
	public void setUpdateTest() {
	
		BankBookDTO bankBookDTO = new BankBookDTO();
		bankBookDTO.setBookNumber(4800L);
		bankBookDTO.setBookName("Update Name");
		bankBookDTO.setBookRate(1.00);
		bankBookDTO.setBookSale(1);
		
		int result = bankBookDAO.setUpdate(bankBookDTO);
		
		assertNotEquals(0, result);

	}
}

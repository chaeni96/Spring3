package com.iu.c1.bankbook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iu.c1.util.Pager;

@Service
public class BankBookService {
	
	@Autowired
	private BankBookDAO bankBookDAO;
	
	public BankBookDTO getSelect(BankBookDTO bankBookDTO) {
		return bankBookDAO.getSelect(bankBookDTO);
	}
	
	public List<BankBookDTO> getList(Pager pager){
		pager.makeRow();
		pager.makeNum();
		return bankBookDAO.getList(pager);
	}
	
	public int setInsert(BankBookDTO bankBookDTO) {
		return bankBookDAO.setInsert(bankBookDTO);
	}
	
	public int setDelete(Long bookNumber) {
		return bankBookDAO.setDelete(bookNumber);
	}
	
	public int setUpdate(BankBookDTO bankBookDTO) {
		return bankBookDAO.setUpdate(bankBookDTO);
	}
}

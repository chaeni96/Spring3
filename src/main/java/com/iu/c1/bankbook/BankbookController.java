package com.iu.c1.bankbook;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/bankbook/*")
public class BankbookController {
	//pojo( plain Old Java Object)
	
	@RequestMapping(value = "bankbookList.do", method = RequestMethod.GET)
	public ModelAndView list(Integer [] num, ModelAndView mv) {
		
		for(Integer i : num) {
			System.out.println(i);
		}
		
		System.out.println("bankbook list");
		
		//ModelAndView mv = new ModelAndView();
		mv.setViewName("bankbook/bankbookList");
		return mv;
	}
	
	@RequestMapping("bankbookSelect")
	public void select(@RequestParam(defaultValue = "1", value = "n") Integer num, String name, Model model) {
		
		System.out.println("Value : "+num);
		System.out.println("Name : "+name);
		BankBookDTO bankBookDTO = new BankBookDTO();
		bankBookDTO.setBookName("BookName");
		model.addAttribute("dto", bankBookDTO );
		model.addAttribute("test", "iu");
		
		//return "bankbook/bankbookSelect";
	}
	
	@RequestMapping("bankbookInsert.do")
	public String insert(BankBookDTO bankBookDTO) {
		
		System.out.println(bankBookDTO.getBookName());
		System.out.println("Insert");
		return "redirect:../";
	}
}

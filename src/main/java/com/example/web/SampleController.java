package com.example.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.domain.ProductVO;

@Controller
public class SampleController {
	@RequestMapping("/doA")
	public void doA(){
		System.out.println("doA.....................................");
	}
	@RequestMapping("/doB")
	public void doB(){
		System.out.println("doB........................................");
	}
	@RequestMapping("/doC")
	public String doC(@ModelAttribute("msg") String msg){
		System.out.println("doC...................................." + msg);
		return "result";
	}
	@RequestMapping("/doD")
	public String doD(Model model){
		ProductVO vo=new ProductVO("냉장고",1000000);
		model.addAttribute("vo", vo);
		return "product";
	}
	@RequestMapping("/doE")
	public String doE(){
		return "redirect:/doD" ;
	}
	@RequestMapping("/doJSON")
	public @ResponseBody ArrayList<ProductVO> doJSON(){
		ArrayList<ProductVO> array=new ArrayList<ProductVO>();
		
		ProductVO vo=new ProductVO("세탁기",5000000);
		array.add(vo);
		
		vo=new ProductVO("냉장고", 4000000);
		array.add(vo);
		
		return array;
	}
//void:이동하지 않음
	//String : jsp파일로 이동
	//ResponseBody:json파일로 이동
}


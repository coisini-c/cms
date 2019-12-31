package com.cx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cx.bean.Dats;
import com.cx.bean.Goods;
import com.cx.service.GoodsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class GoodsController {
	@Autowired
	private GoodsService service;
	
	
	@RequestMapping("selall.do")
	public String selall(Model m,Dats dats) {
		System.out.println("dats.jod"+dats.getGid());
		if (dats.getPagenum()==null||dats.getPagenum()==0) {
			dats.setPagenum(1);
		}
		PageHelper.startPage(dats.getPagenum(),4);
		PageInfo<Goods> page=new PageInfo<Goods>(service.selall(dats));
		List<Goods> list = page.getList();
		m.addAttribute("list", list);
		m.addAttribute("page", page);
		m.addAttribute("dats", dats);
		return "list";
	}
	
	@RequestMapping("del.do")
	public String del(Integer[] ids) {
		for (Integer integer : ids) {
			System.out.println(integer);
		}
		service.del(ids);
		
		return "redirect:selall.do";
	}
}

package com.cx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cx.bean.Dats;
import com.cx.bean.Goods;
import com.cx.dao.GoodsDao;
import com.cx.service.GoodsService;
@Service
public class GoodsServiceImpl implements GoodsService {
	@Autowired
	private GoodsDao dao;

	@Override
	public List<Goods> selall(Dats dats) {
		// TODO Auto-generated method stub
		return dao.selall(dats);
	}

	@Override
	public void del(Integer[] ids) {
		// TODO Auto-generated method stub
		int pd=dao.del(ids);
		System.out.println(pd);
		
	}
	
	
}	

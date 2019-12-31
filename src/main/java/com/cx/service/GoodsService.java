package com.cx.service;

import java.util.List;

import com.cx.bean.Dats;
import com.cx.bean.Goods;

public interface GoodsService {

	List<Goods> selall(Dats dats);

	void del(Integer[] ids);

}

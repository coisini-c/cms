package com.cx.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cx.bean.Dats;
import com.cx.bean.Goods;

public interface GoodsDao {

	List<Goods> selall(Dats dats);

	int del(@Param("ids")Integer[] ids);

}

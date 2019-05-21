package com.hxzy.mybatis.mapper;

import java.util.List;

import com.hxzy.mybatis.pojo.Orders;
import com.hxzy.mybatis.pojo.User;

public interface OrderMapper {

    //	一对一
	public List<Orders> selectOrders();
	
	public List<User> selectUserList();
}

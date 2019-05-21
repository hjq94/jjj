package com.hxzy.mybatis.juit;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.hxzy.mybatis.mapper.OrderMapper;
import com.hxzy.mybatis.pojo.Orders;
import com.hxzy.mybatis.pojo.User;

public class MybatisMapperTest2 {
   
	@Test
	public void test() throws IOException {
		InputStream in=Resources.getResourceAsStream("sqlMapConfig.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
		SqlSession sqlSession= sqlSessionFactory.openSession();
		OrderMapper orderMapper=sqlSession.getMapper(OrderMapper.class);
		   List<Orders> orderlist= orderMapper.selectOrders();
		for(Orders o:orderlist) {
			
			System.out.println(o);
		}
		
	}
	
	
	@Test
	public void test2() throws IOException {
		InputStream in=Resources.getResourceAsStream("sqlMapConfig.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
		SqlSession sqlSession= sqlSessionFactory.openSession();
		OrderMapper orderMapper=sqlSession.getMapper(OrderMapper.class);
		   List<User> orderlist= orderMapper.selectUserList();
		for(User o:orderlist) {
			
			System.out.println(o);
		}
		
	}
	
	
	
	
	
	
}

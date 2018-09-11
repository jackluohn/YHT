package com.csust.tea.mapper;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.csust.tea.Order;
import com.csust.tea.Order1;
import com.csust.tea.Order2;
import com.csust.tea.Product;
import com.mysql.fabric.xmlrpc.base.Data;





@Mapper
public interface OrderMapper {
	
	
	
	@Insert("insert into orders(Pname,size,sugar,temp,opt,price,Ptime) values(#{pname},#{size},#{sugar},#{temp},#{opt},#{price},#{data1})")
	void add(Order order);


	@Select("select * from orders")
	List<Order> list();
	
	@Select("select * from orders where pname = #{name}")
	List<Order>  list1(String name);
	
	
	@Select("select distinct(Ptime)  from orders;")
	List<java.sql.Date> listTime();


	@Select("select * from orders where Ptime = #{time}")
	List<Order2> list2(Date time);
	
	@Select("select Pname, sum(price) as prices,  sum(price)/(select sum(price) from orders) as ratio, count(1) as counts   from orders   group by Pname order by prices desc")
    List<Order1>  list3();

}

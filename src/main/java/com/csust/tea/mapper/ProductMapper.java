package com.csust.tea.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.csust.tea.Product;




@Mapper
public interface ProductMapper {
	

	
	@Insert("insert into products(name,price1,price2,price3) values(#{name},#{price1},#{price2},#{price3})")
	void add(Product product);
	
	
	@Select("select * from products")
	List<Product> list ();
	
	@Delete("delete from products where name = #{name}")
	void delete(String name);

	

	
}

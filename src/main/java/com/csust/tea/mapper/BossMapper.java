package com.csust.tea.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.csust.tea.Boss;

@Mapper
public interface BossMapper {
	
	
	@Select("select * from boss")
	List<Boss> login1();
	
	@Select("select * from boss")
	List<Boss> login(Boss boss);
	
	@Insert("insert into boss(name,password) values(#{name},#{password})")
	List<Boss> register(Boss boss);

	@Delete("delete from boss where name = #{name}")
	void delete(String name);

}

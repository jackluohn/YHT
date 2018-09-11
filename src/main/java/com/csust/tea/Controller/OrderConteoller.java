package com.csust.tea.Controller;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.csust.tea.Order;
import com.csust.tea.Order1;
import com.csust.tea.Order2;
import com.csust.tea.Product;
import com.csust.tea.mapper.OrderMapper;
import com.csust.tea.mapper.ProductMapper;

@RestController
@RequestMapping("/api/v1/tea/order")
public class OrderConteoller {
	
	String Sname;
	Date Stime;

	@Autowired
	OrderMapper mapper;

	@PostMapping
	public Map<String, Object> create(@RequestBody Order order) {
		System.out.println(order);
		// 在控制器中调用 Mapper 中的方法
		mapper.add(order);

		Map<String, Object> msg = new HashMap<>();
		msg.put("msg", "ok");
		return msg;
	}
	
	
	
	@GetMapping("/statistics")
	public List<Order> page() {	
		System.out.println(mapper.list());
//		System.out.println(mapper.listTime());
		return mapper.list();
	}
	
	
	@GetMapping("/Time")
	public List<java.sql.Date> Time(){
		return mapper.listTime();
	}
	
	
	@PostMapping("/ListT")
	public Map<String, Object> time(
			@RequestBody Map<String, Date> t){
		
//		System.out.println(t);
		Stime = (Date) t.get("t");
		System.out.println(Stime);
		
		Map<String, Object> msg = new HashMap<>();
		msg.put("msg", "ok");
		return msg;
	}
	
	@GetMapping("/statistics/time")
	public List<Order2> page2(){
//		return mapper.list();
		return mapper.list2(Stime);
	}
	
	@PostMapping("/list")
	public Map<String, Object> delete(
			@RequestBody Map<String, Object> name
			) {
	
		// 在控制器中调用 Mapper 中的方法
//		mapper.add(product);
//		
//		System.out.println(name.get("name"));
		Sname = (String) name.get("name");
		
		Map<String, Object> msg = new HashMap<>();
		msg.put("msg", "ok");
		return msg;
	}
	
	@GetMapping("/statistics/name")
	public List<Order> page1() {	
		System.out.println(mapper.list());
		return mapper.list1(Sname);

	}
	
	
	@GetMapping("/statistics/chart")
	public List<Order1> chart(){
		return mapper.list3();
	}

}

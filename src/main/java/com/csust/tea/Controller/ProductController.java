package com.csust.tea.Controller;

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

import com.csust.tea.Product;
import com.csust.tea.mapper.ProductMapper;





@RestController
@RequestMapping("/api/v1/tea")
public class ProductController {

	@Autowired
	ProductMapper mapper;
	

	
	
	@PostMapping
	public Map<String, Object> create(
			@RequestBody Product product) {
		System.out.println("QuestionController: " + product);
		// 在控制器中调用 Mapper 中的方法
		mapper.add(product);
		
		Map<String, Object> msg = new HashMap<>();
		msg.put("msg", "ok");
		return msg;
	}
	
	@GetMapping("/product")
	public List<Product> page() {
		
		return mapper.list();
	}
	
	@PostMapping("/list")
	public Map<String, Object> delete(
			@RequestBody Map<String, Object> name1
			) {
	
		// 在控制器中调用 Mapper 中的方法
//		mapper.add(product);
		
		System.out.println(name1.get("name"));

//	    System.out.println(name2);
		mapper.delete((String) name1.get("name"));
		
		Map<String, Object> msg = new HashMap<>();
		msg.put("msg", "ok");
		return msg;
	}
	
	


	

}

package com.csust.tea.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.csust.tea.Boss;
import com.csust.tea.Order;
import com.csust.tea.mapper.BossMapper;

@RestController
@RequestMapping("/api/v1/tea")
public class BossController {

	@Autowired
	BossMapper userMapper;

	@PostMapping("/login")
	public int login(@RequestBody Boss boss) {

		List<Boss> st1 = userMapper.login(boss);
		System.out.println(st1);
		int i = 0;

		if (boss.getName().length() == 0 || boss.getPassword().length() == 0) {

			i = 1;
		} else {
			for (Boss s1 : st1) {
				if (boss.getName().equals(s1.getName()) && boss.getPassword().equals(s1.getPassword())) {

					i = 2;
				} else if (!(boss.getPassword().equals(s1.getPassword()))) {
					i = 3;
				}
			}
		}

		return i;

	}

	@PostMapping("/register")
	public Map<String, Object> register(@RequestBody Boss boss) {

		System.out.println(boss);
		userMapper.register(boss);
		Map<String, Object> msg = new HashMap<>();
		msg.put("msg", "ok");
		return msg;
	}
	
	@GetMapping("/boss")
	public List<Boss> boss(){
		return userMapper.login1();
	}
	
	@PostMapping("/delete")
	public Map<String, Object> delete(
			@RequestBody Map<String, Object> name1
			) {
	
		// 在控制器中调用 Mapper 中的方法
//		mapper.add(product);
		
		System.out.println(name1.get("name1"));

//	    System.out.println(name2);
		userMapper.delete((String) name1.get("name1"));
		
		Map<String, Object> msg = new HashMap<>();
		msg.put("msg", "ok");
		return msg;
	}
}

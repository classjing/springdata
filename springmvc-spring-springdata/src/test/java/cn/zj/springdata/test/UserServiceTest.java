package cn.zj.springdata.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.zj.springdata.pojo.User;
import cn.zj.springdata.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-data.xml")
public class UserServiceTest {

	
	@Autowired
	private UserService service;
	
	@Test
	public void testLogin() {
		
		User user = new User();
		user.setName("张三");
		user.setPassword("123");
		User findUser = service.login(user);
		System.out.println(findUser);
	}

}

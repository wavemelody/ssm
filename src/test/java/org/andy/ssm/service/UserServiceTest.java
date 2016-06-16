package org.andy.ssm.service;

import javax.annotation.Resource;

import org.andy.ssm.pojo.User;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)		//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class UserServiceTest {
	private static Logger logger = Logger.getLogger(UserServiceTest.class);
	
	@Resource
	private IUserService userService;
	
	@Test
	public void test1(){
		User user = userService.getUserById(1);
		System.out.println(user.getUserName());
		logger.info("用户名：" + user.getUserName());
	}
}

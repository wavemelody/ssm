package org.andy.ssm.service.impl;

import javax.annotation.Resource;

import org.andy.ssm.dao.IUserDao;
import org.andy.ssm.pojo.User;
import org.andy.ssm.service.IUserService;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements IUserService {

	@Resource
	private IUserDao userDao;
	@Override
	public User getUserById(int userId) {
		return userDao.selectByPrimaryKey(userId);
	}

}

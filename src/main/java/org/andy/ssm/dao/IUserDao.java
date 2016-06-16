package org.andy.ssm.dao;

import org.andy.ssm.pojo.User;

public interface IUserDao {
	int deleteByPrimaryKey(Integer id);
	
	int insert(User record);
	
	int insertSelective(User record);
	
	User selectByPrimaryKey(Integer id);
	
	int updateByPrimaryKeySeelective(User record);
	
	int updateByPrimaryKey(User record);
}

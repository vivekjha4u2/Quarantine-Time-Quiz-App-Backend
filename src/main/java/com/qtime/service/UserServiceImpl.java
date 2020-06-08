package com.qtime.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qtime.dao.UserDAO;
import com.qtime.model.User;


@ComponentScan("com.qtime.dao")
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDAO userDao;
	
	@Override
	public long registerUser(User user) throws Exception
	{
		try {
		long userid=userDao.registerUser(user);
		return userid;
		}
		catch(Exception e)
		{
			throw e;
		}
	}
	

}

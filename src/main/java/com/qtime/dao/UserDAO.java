package com.qtime.dao;

import com.qtime.model.User;

public interface UserDAO {
	
	public long registerUser(User user) throws Exception;

}

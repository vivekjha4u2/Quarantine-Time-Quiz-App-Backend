package com.qtime.dao;

import java.util.Random;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.qtime.entity.UserEntity;
import com.qtime.model.User;

@ComponentScan("com.qtime.entity")
@Repository("userDao")

public class UserDAOImpl implements UserDAO {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public long registerUser(User user)
	{
		UserEntity ue=new UserEntity();
		ue.setUserName(user.getUserName());
		ue.setGender(user.getGender());
		Random r = new Random( System.currentTimeMillis() );
	    int qid=(1 + r.nextInt(2)) * 10000 + r.nextInt(10000); 
	    System.out.println("Q-"+qid);
	    ue.setQuizId("Q-"+qid);
	    entityManager.persist(ue);
	    System.out.println("inserted");
	    return (ue.getUserId());
	}
		
		
	
}

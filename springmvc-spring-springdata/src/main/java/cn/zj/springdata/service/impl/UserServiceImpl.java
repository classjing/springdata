package cn.zj.springdata.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.zj.springdata.pojo.User;
import cn.zj.springdata.repository.UserRepository;
import cn.zj.springdata.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	
	@Autowired
	private UserRepository repository;
	
	@Override
	public User login(User user) {
		
		User findUser = repository.findByNameAndPassword(user.getName(), user.getPassword());
		
		return findUser;
	}

}

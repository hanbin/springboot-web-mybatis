package cn.com.hanbinit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.hanbinit.domain.User;
import cn.com.hanbinit.mapper.UserMapper;

@Service
public class UserService {
	
	@Autowired
	private UserMapper userMapper;

	public User getUserInfo() {
		User user = userMapper.findUserInfo();
		// User user=null;
		return user;
	}
}

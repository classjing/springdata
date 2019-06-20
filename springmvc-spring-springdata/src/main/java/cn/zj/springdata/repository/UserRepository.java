package cn.zj.springdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cn.zj.springdata.pojo.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	
	User findByNameAndPassword(String name,String password);
}

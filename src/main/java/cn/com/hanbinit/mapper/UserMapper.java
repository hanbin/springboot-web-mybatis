package cn.com.hanbinit.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import cn.com.hanbinit.domain.User;

@Mapper
public interface UserMapper {
		
	@Select("select *from user where name = #{name}")
	User findByName(@Param("name") String name);
	
	@Insert("insert into user(id,name,age) values(#{id}, #{name},#{age})")
	int insert(@Param("id") Integer id, @Param("name") String name, @Param("age") Integer age);
	
	User findUserInfo();
}

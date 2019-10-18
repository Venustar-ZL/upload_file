package com.learn.upload_file.dao;
import com.learn.upload_file.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserDao {

    List<User> selectAll();

}

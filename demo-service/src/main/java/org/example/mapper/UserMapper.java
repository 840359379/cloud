package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.model.User;

@Mapper
public interface UserMapper {

    User selectAll(int userId);


}

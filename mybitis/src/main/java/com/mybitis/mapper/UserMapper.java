package com.mybitis.mapper;
import com.mybitis.entity.User;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
@Mapper
public interface UserMapper {
    public List<User> findAllUser();
    public List<User> findUserByUserId(int userid);
    public List<User> findUserByUsername(String username);
    public int insertUser(User user);
    public int updateUser(User user);
    public int deleteUser(User user);
}

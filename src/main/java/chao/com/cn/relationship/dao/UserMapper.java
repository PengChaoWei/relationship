package chao.com.cn.relationship.dao;

import org.apache.ibatis.annotations.Mapper;

import chao.com.cn.relationship.model.User;
import chao.com.cn.relationship.model.UserKey;

@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(UserKey key);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(UserKey key);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    int countByExample(User record);
}
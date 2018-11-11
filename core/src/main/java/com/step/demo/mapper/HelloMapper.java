package com.step.demo.mapper;

import com.step.base.BaseMapper;
import com.step.demo.Hello;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @Desc
 * @LastPeson xuxu
 **/
@Repository
public interface HelloMapper extends BaseMapper<Hello> {

    @Select("SELECT * FROM User WHERE id = #{id}")
    Hello selectById(@Param("id") Long id);

}

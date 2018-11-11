package com.step.demo.mapper;

import com.step.base.BaseMapper;
import com.step.demo.model.Hello;
import org.apache.ibatis.annotations.Param;

/**
 * @Desc
 * @LastPeson xuxu
 **/
//@Repository
public interface HelloMapper extends BaseMapper<Hello> {

    //@Select("SELECT * FROM User WHERE id = #{id}")
    //Hello selectById(@Param("id") Long id);

    Hello selectById(Long id);



}

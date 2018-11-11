package com.step.base;

import com.step.base.BaseEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @Desc
 * @LastPeson xuxu
 **/
public interface BaseMapper<T extends BaseEntity> {

  // @Insert("insert into User values(102,'springboot')")
   //T insert(T t);

   int insert(T t);

   //@Select("SELECT * FROM User WHERE id = #{id}")
   //T selectOneById(@Param("id") Long id);

   T selectOneById( Long id);
}

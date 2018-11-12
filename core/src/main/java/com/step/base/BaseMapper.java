package com.step.base;

import com.step.base.BaseEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @Desc 需要生成对应的 mapper.xml文件
 * @LastPeson xuxu
 **/
public interface BaseMapper<T extends BaseEntity> {

  // @Insert("insert into User values(102,'springboot')")
   //T insert(T t);

   //保存
   int insert(T t);

   //批量新增
   int insert(List<T> list);

   //更新
   int update(T t);

   //批量更新
   int update(List<T> list);

   //@Select("SELECT * FROM User WHERE id = #{id}")
   //T selectOneById(@Param("id") Long id);

   //根据ID查询
   T selectOneById(Long id);

   // 根据条件查询
   List<T> selectByMap(Map<String,Object> map);

   // 分页查询
   List<T> selectPage(Integer pageSize,Integer pageNumber,Map<String,Object> map);

    //查询总数
    Integer selectPageCount(Map<String,Object> map);

   //根据ID删除
   int deleteById(Long id);

   //
}

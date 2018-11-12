package com.step.demo.dao;

import com.step.base.MayBatisDao;
import com.step.demo.mapper.HelloMapper;
import com.step.demo.model.Hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Desc
 * @LastPeson xuxu
 **/
@Service("helloDao")
public class HelloDao extends MayBatisDao<Hello> {

    @Autowired
    private HelloMapper mapper;

    public HelloMapper getMapper() {
        return mapper;
    }


}

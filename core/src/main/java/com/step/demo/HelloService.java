package com.step.demo;

import com.step.base.BaseService;
import com.step.demo.model.Hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Desc
 * @LastPeson xuxu
 **/
@Service("helloService")
public class HelloService extends BaseService<Hello> {

    @Autowired
    private HelloDao helloDao;

    @Override
    public HelloDao getDao() {
        return helloDao;
    }

}

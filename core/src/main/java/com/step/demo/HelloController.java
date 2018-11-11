package com.step.demo;

import com.step.base.BaseController;
import com.step.demo.model.Hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Desc
 * @LastPeson xuxu
 **/
@RestController
@RequestMapping("hello")
public class HelloController extends BaseController<Hello> {

    @Autowired
    private HelloService helloService;

    @Override
    public HelloService getBaseService() {
        return helloService;
    }

    @GetMapping("1")
    public Hello hello(){
        System.err.println("hello 1!");
       return helloService.getDao().getMapper().selectById(101L);
    }

}

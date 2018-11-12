package com.step.base;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


public abstract class BaseController<T extends BaseEntity> {

    public abstract BaseService<T> getBaseService();

    @RequestMapping("/save")
    public T save(T t){
       //return getBaseService().getDao().getMapper().insert(t) > 0 ? t : t;
       return getBaseService().insert(t) > 0 ? t : t;
    }

    @GetMapping(value="/query/{id}")
    public T selectById(@PathVariable Long id){
        //return getBaseService().getDao().getMapper().selectOneById(id);
        return getBaseService().selectById(id);
    }
}

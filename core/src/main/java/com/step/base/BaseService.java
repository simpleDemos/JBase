package com.step.base;


public abstract class BaseService<T extends BaseEntity>{

    public abstract MayBatisDao<T> getDao();

    public int insert(T t) {
        return getDao().insert(t);
    }

    public T selectById(Long id) {
        return getDao().selectById(id);
    }


}

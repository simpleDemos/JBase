package com.step.base;

/**
 * @Desc
 * @LastPeson xuxu
 **/
public abstract class MayBatisDao<T extends BaseEntity> {

    public abstract BaseMapper<T> getMapper();

    /**
     * 增加记录
     *
     * @return
     */
    public int insert(T t) {
        return getMapper().insert(t);
    }

    public T selectById(Long id) {
        return getMapper().selectOneById(id);
    }
}

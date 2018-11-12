package com.step.base;

import java.util.List;

/**
 * @Desc
 * @LastPeson xuxu
 **/
public class Page<T extends BaseEntity> {

    private List<T> data;

    private Integer pageNumber = 10;

    private Integer pageSize = 0;

    private Integer totolCount;//总数

    private Integer currentCount;//当前页数据条数

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotolCount() {
        return totolCount;
    }

    public void setTotolCount(Integer totolCount) {
        this.totolCount = totolCount;
    }

    public Integer getCurrentCount() {
        return currentCount;
    }

    public void setCurrentCount(Integer currentCount) {
        this.currentCount = currentCount;
    }
}

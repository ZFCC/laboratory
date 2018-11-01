package com.zky.laboratory.controller.DTO;

import java.io.Serializable;
import java.util.Map;

/**
 * Copyright (C), 2002-2018,
 * FileName: QueryByPageDTO
 * Author:  18075555
 * Date: 2018/10/25 16:46.
 * Description: //描述当前类所属模块
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
public class QueryByPage implements Serializable {

    private Integer pageNumber=1;

    private Integer pageSize=10;
    //排序方式 asc desc 加正序倒序
    private Integer orderBy;

    private Map<String, Object> queryMap;

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

    public Integer getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(Integer orderBy) {
        this.orderBy = orderBy;
    }

    public Map<String, Object> getQueryMap() {
        return queryMap;
    }

    public void setQueryMap(Map<String, Object> queryMap) {
        this.queryMap = queryMap;
    }

    @Override
    public String toString() {
        return "QueryByPage{" +
                "pageNumber=" + pageNumber +
                ", pageSize=" + pageSize +
                ", orderBy=" + orderBy +
                ", queryMap=" + queryMap +
                '}';
    }
}

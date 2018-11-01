/*
 * Copyright (C), 2002-2018
 * FileName: QueryParam.java
 * Author:   13040569
 * Date:     2015年6月19日 下午7:21:03
 * Description: //模块目的、功能描述      
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
package com.zky.laboratory.service.serviceImpl;

import java.io.Serializable;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author 13040569
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class QueryParam implements Serializable {

    /**
     * 序列化默认值
     */
    private static final long serialVersionUID = 1L;
    //第几页,从1开始
    private int pageNumber = 1;
    //每页大小,默认是10
    private int pageSize = 10;
    //排序方式 asc desc 加正序倒序
    private String orderBy;
    //条件参数
    private Map<String, Object> whereParam;

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public Map<String, Object> getWhereParam() {
        return whereParam;
    }

    public void setWhereParam(Map<String, Object> whereParam) {
        this.whereParam = whereParam;
    }

    @Override
    public String toString() {
        return "QueryParam [pageNumber=" + pageNumber + ", pageSize="
                + pageSize + ", orderBy=" + orderBy + ", whereParam="
                + whereParam + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((orderBy == null) ? 0 : orderBy.hashCode());
        result = prime * result + pageNumber;
        result = prime * result + pageSize;
        result = prime * result
                + ((whereParam == null) ? 0 : whereParam.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QueryParam other = (QueryParam) obj;
        if (orderBy == null && other.orderBy != null) {
            return false;
        } else if (orderBy != null && !orderBy.equals(other.orderBy)) {
            return false;
        }
        if (whereParam == null && other.whereParam != null) {
            return false;
        } else if (whereParam != null && !whereParam.equals(other.whereParam)) {
            return false;
        }
        if (pageNumber != other.pageNumber || pageSize != other.pageSize) {
            return false;
        }
        return true;
    }
}

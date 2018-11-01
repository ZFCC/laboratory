/*
 * Copyright (C), 2002-2018
 * FileName: QueryResult.java
 * Author:   13040569
 * Date:     2015年6月19日 下午7:26:43
 * Description: //模块目的、功能描述      
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
package com.zky.laboratory.service.serviceImpl;

import java.util.List;

/**
 * 查询返回结果
 * 
 * @author 13040569
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class QueryResult<T> extends QueryParam {

    /**
     */
    private static final long serialVersionUID = -118155599922538173L;

    // 总记录数
    private long totalCount;
    // 总页数
    private long totalPageCount;

    // 业务的具体类型
    private List<T> resultObject;

    public List<T> getResultObject() {
        return resultObject;
    }

    public void setResultObject(List<T> resultObject) {
        this.resultObject = resultObject;
    }

    public long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(long totalCount) {
        this.totalCount = totalCount;
    }

    public long getTotalPageCount() {
        return totalPageCount;
    }

    public void setTotalPageCount(long totalPageCount) {
        this.totalPageCount = totalPageCount;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = (int) (prime * result + totalCount);
        result = (int) (prime * result + totalPageCount);
        result = prime * result
                + ((resultObject == null) ? 0 : resultObject.hashCode());
        return result + super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QueryResult other = (QueryResult) obj;
        if (totalCount != other.totalCount || totalPageCount != other.totalPageCount) {
            return false;
        }
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "QueryResult [totalCount=" + totalCount + ", totalPageCount="
                + totalPageCount + "]";
    }
}

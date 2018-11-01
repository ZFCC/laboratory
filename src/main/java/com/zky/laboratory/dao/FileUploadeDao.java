package com.zky.laboratory.dao;

import com.zky.laboratory.controller.dto.FileUploadeDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * Copyright (C), 2002-2018,
 * FileName: FileUploadeDao
 * Author:  18075555
 * Date: 2018/10/31 14:57.
 * Description: //描述当前类所属模块
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
@Mapper
@Repository
public interface FileUploadeDao {

    int photoUploade(FileUploadeDTO fileUploadeDTO);

    FileUploadeDTO getPhotoByUserNumber(int id);
}

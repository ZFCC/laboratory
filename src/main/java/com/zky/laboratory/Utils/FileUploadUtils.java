package com.zky.laboratory.Utils;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * Copyright (C), 2002-2018,
 * FileName: FileUploadUtils
 * Author:  18075555
 * Date: 2018/10/30 20:00.
 * Description: //文件上传工具包
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
public class FileUploadUtils {

    /**
     * 获取文件后缀
     * @param fileName
     * @return
     */
    public static String getSuffix(String fileName){
        return fileName.substring(fileName.lastIndexOf("."));
    }

    /**
     * 生成新的文件名
     * @param fileOriginName
     * @return
     */
    public static String getFileName(String fileOriginName){
        return StringUtils.getUUID()+ FileUploadUtils.getSuffix(fileOriginName);
    }

  /**
  * 
  * 功能描述: <br>
  * [功能描述]：保存文件到本地硬盘
  * [应用场景]：	  
  * 创建人：18075555
  * 创建时间：2018/11/1 18:01
  * 修改记录：工号(姓名)-修改内容
  * @see [相关类/方法](可选)
  * @since [产品/模块版本](可选)
  */
    public static String uploadPhoto(MultipartFile file, String path, String fileName){

        //加UUID的路径
        String fileRealPath = path +"/"+ FileUploadUtils.getFileName(fileName);
        //原路径
//        String fileRealPath = path +"/"+fileName;
        File destFile = new File(fileRealPath);
        //判断文件父目录是否存在
        if(!destFile.getParentFile().exists()){
            destFile.getParentFile().mkdir();
        }
        try {
            //保存文件到本地硬盘
            file.transferTo(destFile);
        } catch (IOException e) {
                e.printStackTrace();
            }
        //返回文件路径
        return fileRealPath;
    }

}

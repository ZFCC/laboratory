package com.zky.laboratory.Utils;

import freemarker.template.utility.StringUtil;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
import java.util.regex.Pattern;

/**
 * Copyright (C), 2002-2018,
 * FileName: StringUtiles
 * Author:  18075555
 * Date: 2018/10/30 17:28.
 * Description: //描述当前类所属模块
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
public class StringUtils {

    /**
     * [功能描述]：判断str是否为null或""
     * 创建人：18075555
     * 创建时间：2018/10/30  17:29.
     * 修改记录：工号(姓名)-修改内容
     * @param [相关类/方法](可选)
     * @return [产品/模块版本](可选)
     */
    public static boolean isEmpty(String str){
        return   str == null || str.length() ==0;
    }
    public static boolean isNotEmpty(String str){
        return !isEmpty(str);
    }

    /**
     * [功能描述]：添加书名号《》
     * 创建人：18075555
     * 创建时间：2018/10/30  17:53.
     * 修改记录：工号(姓名)-修改内容
     *
     * @param [相关类/方法](可选)
     * @return [产品/模块版本](可选)
     */
    public static String addBookBrackets(String str){
        String string = null;
        if (isEmpty(str)){
            return string;
        }
        string = "《"+str+"》";
        return string;
    }

    /**
     * [功能描述]：校验手机号码格式
     * 创建人：18075555
     * 创建时间：2018/10/30  17:53.
     * 修改记录：工号(姓名)-修改内容
     *
     * @param [相关类/方法](可选)
     * @return [产品/模块版本](可选)
     */
    public static boolean validateTelNumber(String string){
        String telRegex = "[1][3578]\\d{9}";
        return string.matches(telRegex);
    }
    /**
     * [功能描述]：6-18位数字字母校验
     * 创建人：18075555
     * 创建时间：2018/10/30  17:27.
     * 修改记录：工号(姓名)-修改内容
     *
     * @param [相关类/方法](可选)
     * @return [产品/模块版本](可选)
     */
    public static boolean validateEntryParam(String str){
        boolean result = false;
        if(StringUtils.isEmpty(str)){
            return result;
        }
        //1-18位数字校验
        String numberRegex = "^[a-zA-Z0-9]{6,18}$";
        result = Pattern.matches(numberRegex, str);
        return result;
    }

    /**
     * [功能描述]：数字字符串左边加0，至字符串长18位，（左补0满18位）
     * 如："123123" --> "000000000000123123"
     * 创建人：18075555
     * 创建时间：2018/10/30  19:22.
     * 修改记录：工号(姓名)-修改内容
     *
     * @param [相关类/方法](可选)
     * @return [产品/模块版本](可选)
     */
    public static String leftPad(String str){
        if (isEmpty(str)){
            return str;
        }

        return StringUtil.leftPad(str, 18, "0");
    }

    /**
     * 获取uuid
     * @param uuid
     * @return
     */
    public static String getUUID(){
        return UUID.randomUUID().toString().replace("-","");
    }

    /**
     * 将长时间格式字符串转换为时间 yyyy-MM-dd HH:mm:ss
     *
     * @param strDate
     * @return
     */
    public static Date strToDateLong(String strDate) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        ParsePosition pos = new ParsePosition(0);
        return formatter.parse(strDate, pos);
    }

}

package com.step.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Desc 日期工具
 * @LastPeson xuxu
 **/
public class DateUtil {

    public static final String DATE_PATTERN_yyyyMMddHHMMss = "yyyyMMddHHmmss";

    public static String getCurrentDateStr() {
        return new SimpleDateFormat(DATE_PATTERN_yyyyMMddHHMMss).format(new Date());
    }

    public static void main(String[] args) {
        System.err.println(getCurrentDateStr());
    }


}

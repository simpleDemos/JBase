package com.step.util;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * @Desc 文件操作工具
 * @LastPeson xuxu
 **/
public class FileCopyUtil {

    /**
     * 文件复制
     */
    public static int copyFile(){
        String source =
        "E:\\workspace\\20181112\\ground\\cargo-addgoods-project\\ground-addgoods-service\\src\\main\\java\\com\\ground\\";
        String target = "E:\\workspace\\bak\\"+DateUtil.getCurrentDateStr();
        try {
            File _target = new File(target);
            if (!_target.isDirectory()) {
                _target.mkdir();
            }
            FileUtils.copyDirectory(new File(source),_target);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }
        return 0;
    }


    public static void main(String[] args) {
        copyFile();
    }



}

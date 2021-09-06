package com.len.util;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * zip压缩工具类
 *
 * @author liyong
 * @date 2021/9/6 15:46
 */
public class ZipUtil {

    /**
     * 将多个文件压缩到一个压缩包，并将压缩包流写到OutputStream
     *
     * @param inputStreamMap
     * @param os
     * @throws IOException
     */
    public static void zip(Map<String, InputStream> inputStreamMap, OutputStream os) throws IOException {

        ZipOutputStream zipos = new ZipOutputStream(new BufferedOutputStream(os));

        byte[] bs = new byte[1024];
        inputStreamMap.keySet().stream().forEach(k -> {
            try {
                InputStream is = inputStreamMap.get(k);
                zipos.putNextEntry(new ZipEntry(k));
                int len;
                while ((len = is.read(bs)) > 0) {
                    zipos.write(bs, 0, len);
                }
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        zipos.close();

    }

}

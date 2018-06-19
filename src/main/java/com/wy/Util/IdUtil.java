package com.wy.Util;

import java.util.Date;

public class IdUtil {
    public static String generateId() {
        long time = new Date().getTime();
        String res = time + "";
        int rand = (int) (Math.random() * 1000);
        res = res + rand;
        return res;
    }
}

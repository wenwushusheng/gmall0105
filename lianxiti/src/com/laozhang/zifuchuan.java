package com.laozhang;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author zhangchunyu
 * @create 2019-08-30 6:55
 */
public class zifuchuan {


    public static String myTrim(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end && str.charAt(start) == ' ') {
            start++;
        }
        while (start < end && str.charAt(end) == ' ') {
            end--;
        }
        if (start == end) {
            return "";
        }
        return str.substring(start, end + 1);
    }


    public static String reverseString(String str, int start, int end) {
        char[] c = str.toCharArray();//字符串--->字符数组
        return reverseArray(c, start, end);



    }

    public static String reverseArray(char[] c, int start, int end) {
        for (int i = start, j = end; i < j; i++, j--) {
            char temp = c[i];
            c[i] = c[j];
            c[j] = temp;
        }
        //字符数组--->字符串
        return new String(c);
    }

    //方式二：
    public static String reverseString1(String str, int start, int end) {
        String str1 = str.substring(0, start);
        for (int i = end; i >= start; i--) {
            char c = str.charAt(i);
            str1 += c;
        }

        str1 += str.substring(end + 1);
        return str1;
    }




    public static int getTime(String str1, String str2) {
        int count = 0;
        int len;
        while ((len = str1.indexOf(str2)) != -1) {
            count++;
            str1 = str1.substring(len + str2.length());
        }

        return count;
    }


    public static List<String> getMaxSubString(String str1, String str2) {
        String maxStr = (str1.length() > str2.length()) ? str1 : str2;
        String minStr = (str1.length() < str2.length()) ? str1 : str2;
        int len = minStr.length();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            for (int x = 0, y = len - i; y <= len; x++, y++) {
                String str = minStr.substring(x, y);
                if (maxStr.contains(str)) {
                    list.add(str);
                }
            }
            if (list.size() != 0) {
                return list;
            }
        }
        return null;
    }


    public static String sort(String str) {
        char[] c = str.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }


    public static void main(String[] args) {
        String date1 = "1990/1/1"; // 开始“三天打鱼两天晒网”的日期
        String date2 = "1990/1/10"; // 手动输入的日期
        long day = getQuot(date1, date2);// 传入值计算时间差
        if (day % 5 == 0 || day % 5 == 4) {
            System.out.println("今天是休息日，可以晒晒网");
        } else {
            System.out.println("今天要工作，打鱼了！");
        }

    }

    public static long getQuot(String time1, String time2) {
        long dayDistance = 0;
        SimpleDateFormat ft = new SimpleDateFormat("yyyy/MM/dd");
        try {
            Date date1 = ft.parse(time1);
            Date date2 = ft.parse(time2);
            dayDistance = date2.getTime() - date1.getTime();
            dayDistance = dayDistance / 1000 / 60 / 60 / 24 + 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dayDistance;
    }

}




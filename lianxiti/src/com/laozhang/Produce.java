package com.laozhang;

import com.sun.org.apache.bcel.internal.generic.SWAP;
import com.sun.tracing.dtrace.StabilityLevel;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author zhangchunyu
 * @create 2019-07-22 12:48
 */
public class Produce {
/*
    public static void main(String[] args) {

       *//* ArrayList<Object> objects = new ArrayList<>();

        objects.add("老张");

        objects.add(null);
        objects.add(null);
        objects.add(null);
        System.out.println(objects.size());

       *//**//* LinkedList list = new LinkedList();
        list.add("老王");

        HashMap<Object, Object> map = new HashMap<>();
        map.put("name","laozhang");


        String name = "laozhang";
        Integer num = 7;
        String s = String.valueOf(num);
        int i = Integer.parseInt(s);*//**//*
        ThreadLocal<Object> objectThreadLocal = new ThreadLocal<>();
        *//*
        int temp;
        int[] num = new int[]{22, 66, 33, 97, 2, 6, 55,0,88,125,666};
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length - 1 - i; j++) {
                if (num[j] > num[j + 1]) {
                    temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;

                }

            }


        }

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }

    }*/
   /* private static void swap(int[] data, int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    private static void subSort(int[] data, int start, int end) {
        if (start < end) {
            int base = data[start];
            int low = start;
            int high = end + 1;
            while (true) {
                while (low < end && data[++low] - base <= 0)
                    ;
                while (high > start && data[--high] - base >= 0)
                    ;
                if (low < high) {
                    swap(data, low, high);
                } else {
                    break;
                }
            }
            swap(data, start, high);

            subSort(data, start, high - 1);//递归调用
            subSort(data, high + 1, end);
        }
    }
    public static void quickSort(int[] data){
        subSort(data,0,data.length-1);
    }*/


   /* private static void subSort(int[] data, int start, int end) {
        //选择第一个元素作为标志位
        int flag = data[start];
        int low = start;
        int high = end +1;
        //判断不是一个元素
        if (start < end){

            //死循环
            while(true){
                //终止条件,low指针指向的元素大于flag标志的元素
                while (low < end && data[++low] - flag < 0);
                //终止条件,high指针指向的元素小于flag
                while (high > start && data[--high] - flag >= 0);

                //两个循环停下了,判断一下时因为元素的问题还是high指针小于low指针了
                if (low < high){
                    //元素进行交换
                    swap(data,low,high);
                }else {
                    //跳出循环,进行重设标志位,进入下一次循环
                    break;
                }

            }
            //high指针的位置和flag互换
            swap(data,start,high);
            //递归调用
            //flag左边进行排序
            subSort(data,0,high - 1);
            //flag右面进行排序
            subSort(data,high +1,end);

        }

    }
*/
   /* private static void swap(int[] data, int low, int high) {
        int temp = data[low];
        data[low] = data[high];
        data[high] = temp;

    }*/


   /* public static void quickSort(int[] data){
       subSort(data,0,data.length - 1);
   }*/

    private static void quickSort(int[] data) {

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {

                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;


                }

            }
        }


    }

    private static void subSort(int[] data, int start, int end) {
        int flag = data[start];
        int low = start;
        int high = end;

        if (start < end) {

            while (true) {
                while (low < end && data[++low] - flag < 0) ;
                while (high > start && data[--high] - flag >= 0) ;

                if (low < high) {
                    swap(data, low, high);
                } else {
                    break;
                }

            }
            swap(data, start, high);
            subSort(data, 0, high - 1);
            subSort(data, high + 1, end);

        }


    }

    private static void swap(int[] data, int low, int high) {
        int temp = data[low];
        data[low] = data[high];
        data[high] = temp;
    }

    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");

    public static void main(String[] args) {
        /*int[] data = {9, -16, 31, 23, -30, -49, 25, 21, 30, 33, 66, 55, 52, 77};
        System.out.println("排序之前：\n" + java.util.Arrays.toString(data));
        quickSort(data);
        System.out.println("排序之后：\n" + java.util.Arrays.toString(data));*/
        System.out.println(sdf.format(new Date()));
    }






}

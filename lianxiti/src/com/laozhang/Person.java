package com.laozhang;

public class Person{

    public Person(int age){
        this.age = age;
    }
    public int age;

    public static void main(String[] args) {
        System.out.println("你是风儿我是沙,缠缠绵绵到天涯");
    }

   /*     Arrays.sort(arr,new Comparator(){

            //按照字符串从大到小的顺序排列
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof String && o2 instanceof  String){
                    String s1 = (String) o1;
                    String s2 = (String) o2;
                    return -s1.compareTo(s2);
                }
//                return 0;
                throw new RuntimeException("输入的数据类型不一致");
            }
        });
        System.out.println(Arrays.toString(arr));*/




    }



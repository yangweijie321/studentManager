package com.nantianxinxi_11;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = {32,54,65,99,100,43,12,};
        System.out.println("排序前：" + arrayToString(arr));
        /*//第一次比较：
        for(int i = 0;i<arr.length-1-0;i++){
            if (arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        System.out.println("第一次比较后：" + arrayToString(arr));

        //第二次比较：
        for(int i = 0;i<arr.length-1-1;i++){
            if (arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        System.out.println("第二次比较后：" + arrayToString(arr));

        //第三次比较：
        for(int i = 0;i<arr.length-1-2;i++){
            if (arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        System.out.println("第三次比较后：" + arrayToString(arr));

        //第四次比较：
        for(int i = 0;i<arr.length-1-3;i++){
            if (arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        System.out.println("第四次比较后：" + arrayToString(arr));

        //第五次比较：
        for(int i = 0;i<arr.length-1-4;i++){
            if (arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        System.out.println("第五次比较后：" + arrayToString(arr));

        //第六次比较：
        for(int i = 0;i<arr.length-1-5;i++){
            if (arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        System.out.println("第六次比较后：" + arrayToString(arr));*/
        for (int x = 0;x< arr.length-1;x++){
            for(int i = 0;i<arr.length-1;i++){
                if (arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        System.out.println("排序后："+arrayToString(arr));
    }

    public static String arrayToString(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0;i < arr.length;i++){
            if (i == arr.length-1){
            sb.append(arr[i]);
        }else {
                sb.append(arr[i]).append(",");
            }
        }

        sb.append("]");
        String s = sb.toString();
        return s;
    }

}

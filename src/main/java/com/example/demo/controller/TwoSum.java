package com.example.demo.controller;


import java.util.FormatFlagsConversionMismatchException;

public class TwoSum {
    //给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
    //
    //你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
    //给定 nums = [2, 7, 11, 15], target = 9
    //
    //因为 nums[0] + nums[1] = 2 + 7 = 9
    //所以返回 [0, 1]

    //求和的方法:遍历数组
     void getSum(int[] nums, int target) {
         if (nums != null && nums.length != 0) {
             for (int i = 0; i < nums.length; i++) {
                 for (int j = i+1; j < nums.length; j++) {
                     if ((nums[i] + nums[j]) == target) {
                          System.out.print("["+i+","+j+"]");
                     }else {
                         throw new IllegalArgumentException("new matched solution!");
                     }
                 }
             }
         }
     }
        //test
        public static void main (String[] args){
            TwoSum twoSum = new TwoSum();
            //申明一个数组nums
            int[] nums = new int[]{2, 7, 11, 15};

            //申明目标值
            int target = 50;
            twoSum.getSum(nums, target);
        }

    }
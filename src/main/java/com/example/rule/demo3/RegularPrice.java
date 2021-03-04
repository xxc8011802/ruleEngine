package com.example.rule.demo3;

public class RegularPrice extends Price
{
    public double getCharge(int days){
        System.out.println("获取常规价格");
        return days;
    }

    public double getIntegral(int days){
        System.out.println("获取常规积分");
        return days;
    }
}

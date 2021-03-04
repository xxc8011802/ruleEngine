package com.example.rule.demo3;

public class CheapPrice extends Price
{
    public double getCharge(int days){
        System.out.println("获取便宜价格");
        return days*0.5;
    }

    public double getIntegral(int days){
        System.out.println("获取低积分");
        return days*0.5;
    }
}

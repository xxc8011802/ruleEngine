package com.example.rule.demo2;

public interface Action
{
    /**
     * 是否符合发放条件判断
     * @return
     */
    boolean condition();

    /**
     * 执行奖励下发
     * @return
     */
    void execute();
}

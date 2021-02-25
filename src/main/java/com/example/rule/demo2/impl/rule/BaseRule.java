package com.example.rule.demo2.impl.rule;

import com.example.rule.demo2.Rule;

public abstract class BaseRule implements Rule
{
    String rewardName;

    String rewardType;

    String rewardValue;

    public BaseRule(String rewardName, String rewardType, String rewardValue)
    {
        this.rewardName = rewardName;
        this.rewardType = rewardType;
        this.rewardValue = rewardValue;
    }
}

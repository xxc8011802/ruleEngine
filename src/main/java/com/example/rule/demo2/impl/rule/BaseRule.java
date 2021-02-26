package com.example.rule.demo2.impl.rule;

import com.example.rule.demo2.Rule;

public abstract class BaseRule implements Rule
{
    protected String identityId;

    protected String activityId;

    protected String ruleId;

    //奖励名
    protected String rewardName;

    //奖励类型
    protected String rewardType;

    //奖励数量
    protected String rewardValue;

    public BaseRule(){

    }

    public BaseRule(String rewardName, String rewardType, String rewardValue)
    {
        this.rewardName = rewardName;
        this.rewardType = rewardType;
        this.rewardValue = rewardValue;
    }

    @Override
    public void build(String identityId, String activityId,String ruleId){
        this.identityId=identityId;
        this.activityId =activityId;
        this.ruleId = ruleId;
    }
}

package com.example.rule.demo2.impl.action;

import com.example.rule.demo2.Action;
import com.example.rule.demo2.Rule;
import com.example.rule.demo2.RuleFactory;
import com.example.rule.demo2.entity.Reward;

public abstract class BaseAction implements Action
{
    private String identityId;

    private String activityId;

    private String ruleType;

    private String ruleId;

    private int userLevel;

    public BaseAction(String identityId, String activityId, String ruleType, String ruleId, int userLevel)
    {
        this.identityId = identityId;
        this.activityId = activityId;
        this.ruleType = ruleType;
        this.ruleId = ruleId;
        this.userLevel = userLevel;
    }

    /**
     * 基类操作
     * @return
     */
    @Override
    public void execute()
    {
        System.out.println("获取奖励详情");
        RuleFactory ruleFactory = new RuleFactory();
        Rule rule = ruleFactory.getRule(ruleType,ruleId);
        Reward reward = rule.getReward();
        rule.giveReward(reward);
        System.out.println("基类操作,话单记录");
    }

}

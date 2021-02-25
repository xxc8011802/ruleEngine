package com.example.rule.demo2.impl.action;

import com.example.rule.demo2.RuleFactory;

import java.util.Date;

public class SignInAction extends BaseAction
{
    private Date startTime;

    private Date endTime;

    public SignInAction(String identityId, String activityId, String ruleType, String ruleId, int userLevel)
    {
        super(identityId, activityId, ruleType, ruleId, userLevel);
    }

    @Override
    public boolean condition()
    {
        System.out.println("签到条件判断");
        return true;
    }

    @Override
    public void execute()
    {
        System.out.println("签到操作下发奖励");
        super.execute();

    }
}

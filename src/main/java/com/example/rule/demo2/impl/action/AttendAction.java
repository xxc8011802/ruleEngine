package com.example.rule.demo2.impl.action;

public class AttendAction extends BaseAction
{

    public AttendAction(String identityId, String activityId, String ruleType, String ruleId, int userLevel)
    {
        super(identityId, activityId, ruleType, ruleId, userLevel);
    }

    @Override
    public boolean condition()
    {
        System.out.println("报名条件判断");
        return true;
    }

    @Override
    public void execute()
    {
        System.out.println("报名操作下发奖励");
        super.execute();
    }
}

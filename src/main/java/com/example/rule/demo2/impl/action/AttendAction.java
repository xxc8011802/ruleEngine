package com.example.rule.demo2.impl.action;

import java.util.Date;

public class AttendAction extends BaseAction
{

    public AttendAction(String identityId, String activityId, String ruleType, String ruleId, int userLevel)
    {
        super(identityId, activityId, ruleType, ruleId, userLevel);
    }

    public AttendAction(){
        super();
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

    @Override
    public void build(String identityId, String activityId, String ruleType, String ruleId, int userLevel){
        super.build(identityId, activityId, ruleType, ruleId, userLevel);
        System.out.println("attendBuild");
    }

    @Override
    public String toString()
    {
        final StringBuffer sb = new StringBuffer("AttendAction{");
        sb.append("identityId='").append(identityId).append('\'');
        sb.append(", activityId='").append(activityId).append('\'');
        sb.append(", ruleType='").append(ruleType).append('\'');
        sb.append(", ruleId='").append(ruleId).append('\'');
        sb.append(", userLevel=").append(userLevel);
        sb.append('}');
        return sb.toString();
    }
}

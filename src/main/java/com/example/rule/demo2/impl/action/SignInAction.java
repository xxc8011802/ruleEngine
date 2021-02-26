package com.example.rule.demo2.impl.action;

import com.example.rule.demo2.RuleFactory;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

@Component
public class SignInAction extends BaseAction
{
    private Date startTime;

    private Date endTime;

    public SignInAction(String identityId, String activityId, String ruleType, String ruleId, int userLevel)
    {
        super(identityId, activityId, ruleType, ruleId, userLevel);
    }

    public SignInAction(){
        super();
    }

    @Override
    public boolean condition()
    {
        //System.out.println("签到条件判断");
        return true;
    }

    @Override
    public void execute()
    {
        //System.out.println("签到操作下发奖励");
        super.execute();

    }

    @Override
    public void build(String identityId, String activityId, String ruleType, String ruleId, int userLevel){
        super.build(identityId, activityId, ruleType, ruleId, userLevel);
        startTime = new Date();
        endTime = new Date();
        System.out.println("signinBuild");
    }

    @Override
    public String toString()
    {
        final StringBuffer sb = new StringBuffer("SignInAction{");
        sb.append("startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", identityId='").append(identityId).append('\'');
        sb.append(", activityId='").append(activityId).append('\'');
        sb.append(", ruleType='").append(ruleType).append('\'');
        sb.append(", ruleId='").append(ruleId).append('\'');
        sb.append(", userLevel=").append(userLevel);
        sb.append('}');
        return sb.toString();
    }

    public SignInAction clone() throws CloneNotSupportedException {
        return (SignInAction) super.clone();
    }
}

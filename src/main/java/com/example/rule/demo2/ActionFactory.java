package com.example.rule.demo2;

import com.example.rule.demo2.impl.action.AttendAction;
import com.example.rule.demo2.impl.action.SignInAction;
import com.example.rule.demo2.impl.rule.LottoryRule;
import com.example.rule.demo2.impl.rule.VirtualScoreRule;

public class ActionFactory
{
    public Action getAction(String action,String identityId, String activityId, String ruleType, String ruleId, int userLevel){
        if(action == null){
            return null;
        }
        if(action.equalsIgnoreCase("SIGNIN")){
            return new SignInAction(identityId, activityId, ruleType, ruleId, userLevel);
        } else if(action.equalsIgnoreCase("ATTEND")){
            return new AttendAction(identityId, activityId, ruleType, ruleId, userLevel);
        }
        return null;
    }

    public static void main(String[] args)
    {

    }
}

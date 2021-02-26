package com.example.rule.demo2.impl.action;

import com.example.rule.demo2.Action;
import com.example.rule.demo2.Rule;
import com.example.rule.demo2.RuleFactory;
import com.example.rule.demo2.entity.Reward;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/*@Component*/
public abstract class BaseAction implements Action,Serializable,Cloneable
{
    protected String identityId;

    protected String activityId;

    protected String ruleType;

    protected String ruleId;

    protected int userLevel;

    @Autowired
    RuleFactory ruleFactory;


    public static final Map<String ,Class<?>> map = new HashMap<>();

    public BaseAction(String identityId, String activityId, String ruleType, String ruleId, int userLevel)
    {
        this.identityId = identityId;
        this.activityId = activityId;
        this.ruleType = ruleType;
        this.ruleId = ruleId;
        this.userLevel = userLevel;
    }

    public BaseAction(){

    }

    /**
     * 基类操作
     * @return
     */
    @Override
    public void execute()
    {
        //System.out.println("获取奖励详情");
        //RuleFactory ruleFactory = new RuleFactory();
        Rule rule = ruleFactory.getRule(ruleType);
        rule.build(identityId, activityId,ruleId);
        Reward reward = rule.getReward();
        rule.giveReward(reward);
        //System.out.println("基类操作,话单记录");
    }



    public void build(String identityId, String activityId, String ruleType, String ruleId, int userLevel){
        this.identityId=identityId;
        this.activityId=activityId;
        this.ruleType=ruleType;
        this.ruleId=ruleId;
        this.userLevel=userLevel;
    }

    @Override
    public String toString()
    {
        final StringBuffer sb = new StringBuffer("BaseAction{");
        sb.append("identityId='").append(identityId).append('\'');
        sb.append(", activityId='").append(activityId).append('\'');
        sb.append(", ruleType='").append(ruleType).append('\'');
        sb.append(", ruleId='").append(ruleId).append('\'');
        sb.append(", userLevel=").append(userLevel);
        sb.append('}');
        return sb.toString();
    }

    public BaseAction clone() throws CloneNotSupportedException {
        return (BaseAction) super.clone();
    }
}

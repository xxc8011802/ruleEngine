package com.example.rule.demo2.impl.rule;

import com.example.rule.demo2.entity.Reward;

public class LottoryRule extends BaseRule
{

    public LottoryRule(){

    }

    public LottoryRule(String rewardName, String rewardType, String rewardValue)
    {
        super(rewardName, rewardType, rewardValue);
    }

    @Override
    public Reward getReward()
    {
        System.out.println("根据ruleId:"+ruleId+"查询抽奖奖励详情");
        Reward reward = new Reward();
        reward.setResultRewardName("抽奖奖励");
        reward.setResultRewardValue("5");
        return reward;
    }

    @Override
    public boolean giveReward(Reward reward)
    {
        System.out.println("给identityId:"+identityId+"用户下发抽奖奖励[ruleId:"+ruleId+"][rewardValue:"+reward.getResultRewardValue()+"]");
        return true;
    }

    @Override
    public void build(String identityId, String activityId, String ruleId){
        super.build(identityId,activityId,ruleId);
    }
}

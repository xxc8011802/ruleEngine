package com.example.rule.demo2.impl.rule;

import com.example.rule.demo2.entity.Reward;

public class VirtualScoreRule extends BaseRule
{
    public VirtualScoreRule(){

    }

    public VirtualScoreRule(String rewardName, String rewardType, String rewardValue)
    {
        super(rewardName, rewardType, rewardValue);
    }

    @Override
    public Reward getReward()
    {
        System.out.println("根据ruleId:"+ruleId+"查询虚拟点奖励详情");
        Reward reward = new Reward();
        reward.setResultRewardName("虚拟点奖励");
        reward.setResultRewardValue("30");
        return reward;
    }
    @Override
    public boolean giveReward(Reward reward)
    {
        System.out.println("给identityId:"+identityId+"用户下发虚拟点[ruleId:"+ruleId+"][rewardValue:"+rewardValue+"]");
        return true;
    }

    @Override
    public void build(String identityId, String activityId,String ruleId)
    {
        super.build(identityId,activityId,ruleId);
    }
}

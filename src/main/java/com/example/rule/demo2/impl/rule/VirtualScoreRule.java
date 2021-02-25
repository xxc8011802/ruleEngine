package com.example.rule.demo2.impl.rule;

import com.example.rule.demo2.entity.Reward;

public class VirtualScoreRule extends BaseRule
{

    public VirtualScoreRule(String rewardName, String rewardType, String rewardValue)
    {
        super(rewardName, rewardType, rewardValue);
    }

    @Override
    public Reward getReward()
    {
        Reward reward = new Reward();
        reward.setResultRewardName("虚拟点奖励");
        return reward;
    }
    @Override
    public boolean giveReward(Reward reward)
    {
        System.out.println("下发虚拟点");
        return true;
    }
}

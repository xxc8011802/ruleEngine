package com.example.rule.demo2.impl.rule;

import com.example.rule.demo2.entity.Reward;

public class LottoryRule extends BaseRule
{

    public LottoryRule(String rewardName, String rewardType, String rewardValue)
    {
        super(rewardName, rewardType, rewardValue);
    }

    @Override
    public Reward getReward()
    {
        Reward reward = new Reward();
        reward.setResultRewardName("抽奖奖励");
        return reward;
    }

    @Override
    public boolean giveReward(Reward reward)
    {
        System.out.println("下发抽奖");
        return true;
    }
}

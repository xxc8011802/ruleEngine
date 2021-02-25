package com.example.rule.demo2;

import com.example.rule.demo2.entity.Reward;

public interface Rule
{
    Reward getReward();

    boolean giveReward(Reward reward);
}

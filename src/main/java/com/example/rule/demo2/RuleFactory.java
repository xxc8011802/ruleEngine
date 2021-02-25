package com.example.rule.demo2;

import com.example.rule.demo2.impl.rule.LottoryRule;
import com.example.rule.demo2.impl.rule.VirtualScoreRule;

public class RuleFactory
{
    public Rule getRule(String rule,String ruleId){
        if(rule == null){
            return null;
        }
        if(rule.equalsIgnoreCase("LOTTORY")){
            return new LottoryRule("抽奖", "LOTTORY", ruleId);
        } else if(rule.equalsIgnoreCase("VIRTUAL")){
            return new VirtualScoreRule("虚拟点", "VIRTUAL", ruleId);
        }
        return null;
    }
}

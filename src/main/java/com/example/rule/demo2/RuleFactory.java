package com.example.rule.demo2;

import com.example.rule.demo2.impl.action.AttendAction;
import com.example.rule.demo2.impl.action.SignInAction;
import com.example.rule.demo2.impl.rule.LottoryRule;
import com.example.rule.demo2.impl.rule.VirtualScoreRule;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class RuleFactory implements ApplicationContextAware
{

    public static final Map<String ,Class<?>> map = new HashMap<>();

    public Rule getRule(String ruleType){
        try
        {
            Rule rule = (Rule)map.get(ruleType).newInstance();
            return rule;
        }
        catch (InstantiationException e)
        {
            e.printStackTrace();
        }
        catch (IllegalAccessException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext)
        throws BeansException
    {
        map.put("LOTTORY",LottoryRule.class);
        map.put("VIRTUAL",VirtualScoreRule.class);
    }
}

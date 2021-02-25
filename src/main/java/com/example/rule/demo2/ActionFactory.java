package com.example.rule.demo2;

import com.example.rule.demo2.impl.action.AttendAction;
import com.example.rule.demo2.impl.action.BaseAction;
import com.example.rule.demo2.impl.action.SignInAction;
import com.example.rule.demo2.impl.rule.LottoryRule;
import com.example.rule.demo2.impl.rule.VirtualScoreRule;

import java.util.HashMap;
import java.util.Map;

public class ActionFactory
{
    public static final Map<String ,Class<?>> map = new HashMap<>();
    static{
        map.put("SIGNIN",SignInAction.class);
        map.put("ATTEND",AttendAction.class);
    }

    public Action getAction(String action){
        try
        {
            Action action1 = (Action)map.get(action).newInstance();
            System.out.println(action1.toString());
            return action1;
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

    public static void main(String[] args)
    {

    }

}

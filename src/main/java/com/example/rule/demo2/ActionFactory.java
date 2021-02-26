package com.example.rule.demo2;

import com.example.rule.demo2.impl.action.AttendAction;
import com.example.rule.demo2.impl.action.BaseAction;
import com.example.rule.demo2.impl.action.SignInAction;
import com.example.rule.demo2.impl.rule.LottoryRule;
import com.example.rule.demo2.impl.rule.VirtualScoreRule;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

import static org.springframework.beans.BeanUtils.copyProperties;

@Component
public class ActionFactory implements ApplicationContextAware
{
    public static final Map<String ,Class<?>> map = new HashMap<>();

    public static final Map<String ,BaseAction> map2 = new HashMap<>();

    @Autowired
    SignInAction signInAction;

    @Autowired
    AttendAction attendAction;


    public Action getAction(String action) throws CloneNotSupportedException{
        try
        {
            //map存类 每次都需要new一个实例
            Action action1 = (Action)map.get(action).newInstance();
            //map2存对象 原型模式
            BaseAction action2 = (BaseAction)map2.get(action);
            return action2.clone();
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

    public void setApplicationContext(ApplicationContext var1) throws BeansException{
        map.put("SIGNIN",SignInAction.class);
        map.put("ATTEND",AttendAction.class);

        map2.put("SIGNIN",signInAction);
        map2.put("ATTEND",attendAction);
    }

    public static void main(String[] args)
    {

    }

}

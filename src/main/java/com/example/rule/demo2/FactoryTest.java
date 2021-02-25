package com.example.rule.demo2;

import com.example.rule.demo.Shape;
import com.example.rule.demo.ShapeFactory;

public class FactoryTest
{
    public static void main(String[] args)
    {
        ActionFactory actionFactory = new ActionFactory();

        Action signAction = actionFactory.getAction("SIGNIN","1", "1", "LOTTORY", "1",1);
        if(signAction.condition()){
            signAction.execute();
        }

       /* Action attendAction = actionFactory.getAction("ATTEND","1", "1", "VIRTUAL", "1",1);
        if(attendAction.condition()){
            attendAction.execute();
        }*/
    }
}

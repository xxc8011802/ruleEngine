package com.example.rule;

import com.example.rule.demo2.Action;
import com.example.rule.demo2.ActionFactory;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@SpringBootTest
class RuleApplicationTests
{
    @Autowired
    ActionFactory actionFactory;

    private static ExecutorService pool = Executors.newFixedThreadPool(10);

    @Test
    void contextLoads() throws CloneNotSupportedException
    {
        //ActionFactory actionFactory = new ActionFactory();

        Thread thread1 = new actionThread("SIGNIN","18817565826", "1", "LOTTORY", "1001",1);
        Thread thread2 = new actionThread("SIGNIN","13757141254", "1", "LOTTORY", "2001",2);

        pool.submit(thread1);
        pool.submit(thread2);

        for (int i = 0; i <10 ; i++)
        {
            Thread thread = new actionThread("SIGNIN",String.valueOf(i), "1", "LOTTORY", String.valueOf(i),1);
            pool.submit(thread);
        }

        pool.shutdown();

    }

    class actionThread extends Thread{

        protected String actionName;

        protected String identityId;

        protected String activityId;

        protected String ruleType;

        protected String ruleId;

        protected int userLevel;

        public actionThread(String actionName, String identityId, String activityId, String ruleType, String ruleId, int userLevel)
        {
            this.actionName = actionName;
            this.identityId = identityId;
            this.activityId = activityId;
            this.ruleType = ruleType;
            this.ruleId = ruleId;
            this.userLevel = userLevel;
        }

        @SneakyThrows
        @Override
        public void run(){
            Action action = actionFactory.getAction(actionName);
            action.build(identityId, activityId, ruleType, ruleId,userLevel);
            System.out.println(action.toString());
            if(action.condition()){
                action.execute();
            }
        }
    }


}

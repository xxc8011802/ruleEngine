package com.example.rule.demo2.entity;

public class Reward
{
    private String isReceiveReward;
    private String resultRewardType;
    private String resultRewardValue;
    private String resultRewardName;

    public String getIsReceiveReward()
    {
        return isReceiveReward;
    }

    public void setIsReceiveReward(String isReceiveReward)
    {
        this.isReceiveReward = isReceiveReward;
    }

    public String getResultRewardType()
    {
        return resultRewardType;
    }

    public void setResultRewardType(String resultRewardType)
    {
        this.resultRewardType = resultRewardType;
    }

    public String getResultRewardValue()
    {
        return resultRewardValue;
    }

    public void setResultRewardValue(String resultRewardValue)
    {
        this.resultRewardValue = resultRewardValue;
    }

    public String getResultRewardName()
    {
        return resultRewardName;
    }

    public void setResultRewardName(String resultRewardName)
    {
        this.resultRewardName = resultRewardName;
    }

    @Override
    public String toString()
    {
        final StringBuffer sb = new StringBuffer("Reward{");
        sb.append("isReceiveReward='").append(isReceiveReward).append('\'');
        sb.append(", resultRewardType='").append(resultRewardType).append('\'');
        sb.append(", resultRewardValue='").append(resultRewardValue).append('\'');
        sb.append(", resultRewardName='").append(resultRewardName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

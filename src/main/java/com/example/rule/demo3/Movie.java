package com.example.rule.demo3;

public class Movie
{

    public static final String REGULAR ="com.example.rule.demo3.RegularPrice";

    public static final String CHEAP ="com.example.rule.demo3.CheapPrice";

    private Price price;

    public Price getPrice()
    {
        return price;
    }

    public void setPrice(String movieClass)
        throws MovieException
    {
        try
        {
            Class cls = Class.forName(movieClass);
            this.price = (Price)cls.newInstance();
        }
        catch (Exception e)
        {
            throw new MovieException("不存在");
        }
    }
}

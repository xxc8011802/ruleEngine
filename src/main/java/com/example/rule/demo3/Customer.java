package com.example.rule.demo3;

public class Customer
{
    public static void main(String[] args)
        throws MovieException
    {
        Movie regularMovie = new Movie();
        regularMovie.setPrice(Movie.REGULAR);

        double charge = regularMovie.getPrice().getCharge(10);
        double integral = regularMovie.getPrice().getIntegral(10);
        System.out.println(charge+" || "+integral);
    }
}

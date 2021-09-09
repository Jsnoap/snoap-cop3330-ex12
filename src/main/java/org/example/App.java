/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jordan Snoap
 */

package org.example;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    // Function computes interest
    // Prompts user to input initial amount, rate as a %, time in years, and then displays amount accrued
    public static void main( String[] args )
    {
        double principal, rate, years, sum;

        System.out.println("Enter the principal: ");
        Scanner inputPrincipal = new Scanner(System.in);
        principal = inputPrincipal.nextDouble();

        System.out.println("Enter the rate of interest (As a percent): ");
        Scanner inputRate = new Scanner(System.in);
        rate = inputRate.nextDouble();

        System.out.println("Enter the number of years: ");
        Scanner inputYears = new Scanner(System.in);
        years = inputYears.nextDouble();

        sum = principal * (1 + (rate / 100) * years);

        System.out.println("After " + years + " years at " + rate + "%, the investment will be worth $" + String.format("%.2f",sum) + ".");
    }
}

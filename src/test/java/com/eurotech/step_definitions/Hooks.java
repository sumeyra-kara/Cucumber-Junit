package com.eurotech.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUp(){
        System.out.println("***** Before each Test Case ******");
    }

    @After
    public void tearDown(){
        System.out.println("****** After each Test Case ******");
    }

    @Before("@db")
    public void setUpDB(){
        System.out.println("DataBase is connected");
    }
    @After("@db")
    public void tearDownDB(){
        System.out.println("Database is disconnected");
    }



}

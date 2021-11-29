package com.example.demo.test;

public class TestA {

    public String getAName(){
        Test test = new Test();
        String shit = test.getNameById("a shit");
        return shit;
    }

    public String getAName(String a){
        Test test = new Test();
        String shit = test.getNameById("a shit copy");
        return shit;
    }

    public String getBName(){
        Test test = new Test();
        String shit = test.getNameById("b shit");
        return shit;
    }
}

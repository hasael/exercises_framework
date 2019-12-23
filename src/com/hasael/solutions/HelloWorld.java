package com.hasael.solutions;

import com.hasael.common.Solution;

public class HelloWorld implements Solution {

    public Object solution(Object input){
        return innerSolution();
    }

    private String innerSolution(){
        return "hello world";
    }
}

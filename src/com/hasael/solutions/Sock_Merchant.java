package com.hasael.solutions;

import com.hasael.common.Solution;

public class Sock_Merchant implements Solution {
    @Override
    public Object solution(Object input) {
        return innerSolution((int[]) input);
    }

    private int innerSolution(int[] ar) {
        return ar[1];
    }
}

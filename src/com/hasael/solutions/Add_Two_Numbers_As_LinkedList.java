package com.hasael.solutions;

import com.hasael.common.Solution;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Add_Two_Numbers_As_LinkedList implements Solution {
    @Override
    public Object solution(Object input) {
        List<Object> inputs = (List<Object>) input;
        return innerSolution((LinkedList<Integer>) inputs.get(0), (LinkedList<Integer>) inputs.get(1));
    }

    private LinkedList<Integer> innerSolution(LinkedList<Integer> first, LinkedList<Integer> second) {
        return first;
    }
}

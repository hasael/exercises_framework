package com.hasael;

import com.hasael.common.Exercise;
import com.hasael.solutions.Add_Two_Numbers_As_LinkedList;
import com.hasael.solutions.HelloWorld;
import com.hasael.solutions.Longest_Substring_Without_Repeating_Characters;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ExercisesDictionary {

    public static List<Exercise> EXERCISES = Arrays.asList(
            new Exercise(
                    "hello_world",
                    "Display hello world every time",
                    Arrays.asList("first","second"),
                    Arrays.asList("hello world","hello world"),
                    x -> new HelloWorld().solution(x)),
            new Exercise(
                    "Add two numbers as a linked list",
                    "You are given two linked-lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.",
                    Arrays.asList(Arrays.asList(new LinkedList<Integer>(Arrays.asList(2,4,3)),new LinkedList<Integer>(Arrays.asList(5,6,4)))),
                    Arrays.asList(new LinkedList(Arrays.asList(7,0,8))),
                    x -> new Add_Two_Numbers_As_LinkedList().solution(x)),
            new Exercise(
                    "Longest Substring Without Repeating Characters",
                    "Given a string, find the length of the longest substring without repeating characters. Here is an example solution in Python language.",
                    Arrays.asList("abrkaabcdefghijjxxx"),
                    Arrays.asList(10),
                    x -> new Longest_Substring_Without_Repeating_Characters().solution(x))
    );
}

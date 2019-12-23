package com.hasael;

import com.hasael.common.Exercise;
import com.hasael.solutions.HelloWorld;

import java.util.Arrays;
import java.util.List;

public class ExercisesDictionary {

    public static List<Exercise> EXERCISES = Arrays.asList(
            new Exercise(
                    "hello_world",
                    "Display hello world every time",
                    Arrays.asList("first","second"),
                    Arrays.asList("hello world","hello world"),
                    x -> new HelloWorld().solution(x))
    );
}

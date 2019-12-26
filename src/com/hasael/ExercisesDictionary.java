package com.hasael;

import com.hasael.common.Exercise;
import com.hasael.solutions.*;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ExercisesDictionary {

    public static List<Exercise> EXERCISES = Arrays.asList(
            new Exercise(
                    "hello_world",
                    "Display hello world every time",
                    Arrays.asList("first", "second"),
                    Arrays.asList("hello world", "hello world"),
                    x -> new HelloWorld().solution(x)),
            new Exercise(
                    "Add two numbers as a linked list",
                    "You are given two linked-lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.",
                    Arrays.asList(Arrays.asList(new LinkedList<Integer>(Arrays.asList(2, 4, 3)), new LinkedList<Integer>(Arrays.asList(5, 6, 4)))),
                    Arrays.asList(new LinkedList(Arrays.asList(7, 0, 8))),
                    x -> new Add_Two_Numbers_As_LinkedList().solution(x)),
            new Exercise(
                    "Longest Substring Without Repeating Characters",
                    "Given a string, find the length of the longest substring without repeating characters. Here is an example solution in Python language.",
                    Arrays.asList("abrkaabcdefghijjxxx"),
                    Arrays.asList(10),
                    x -> new Longest_Substring_Without_Repeating_Characters().solution(x)),
            new Exercise(
                    "Longest Palindromic Substring",
                    "A palindrome is a sequence of characters that reads the same backwards and forwards. Given a string, s, find the longest palindromic substring in s.",
                    Arrays.asList("banana", "million"),
                    Arrays.asList("anana", "illi"),
                    x -> new Longest_Palindromic_Substring().solution(x)),
            new Exercise(
                    "Counting Valleys",
                    "Gary is an avid hiker. He tracks his hikes meticulously, paying close attention to small details like topography. During his last hike he took exactly  steps. For every step he took, he noted if it was an uphill, , or a downhill,  step. Gary's hikes start and end at sea level and each step up or down represents a  unit change in altitude. ",
                    Arrays.asList("UDDDUDUU", "DDUUUUDD", "DUUUDUDDUDDU"),
                    Arrays.asList(1, 1, 2),
                    x -> new Counting_Valleys().solution(x)),

            new Exercise(
                    "Jumping on the Clouds",
                    "Emma is playing a new mobile game that starts with consecutively numbered clouds. Some of the clouds are thunderheads and others are cumulus. She can jump on any cumulus cloud having a number that is equal to the number of the current cloud plus  or . She must avoid the thunderheads. Determine the minimum number of jumps it will take Emma to jump from her starting postion to the last cloud. It is always possible to win the game.",
                    Arrays.asList(new int[]{0, 1, 0, 0, 0, 1, 0},
                            new int[]{0, 0, 1, 0, 0, 1, 0},
                            new int[]{0, 0, 0, 0, 1, 0}),
                    Arrays.asList(3, 4, 3),
                    x -> new Jumping_Clouds().solution(x))

    );
}

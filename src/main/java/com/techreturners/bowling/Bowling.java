package com.techreturners.bowling;

public class Bowling {

    public int calculateScore(String input){

        int totalScore = 0;

        String scoreWithNoSpace = input.replaceAll("\\s","");

        for (int i = 0; i < scoreWithNoSpace.length(); i++ ) {
            int value = scoreWithNoSpace.charAt(i);
            totalScore = totalScore + Character.getNumericValue(value);
        }

        return totalScore;
    }

}

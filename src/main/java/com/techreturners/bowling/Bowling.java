package com.techreturners.bowling;

public class Bowling {

    public int calculateScore(String input){

        int totalScore = 0;
        int value = 0;

        String scoreWithNoSpace = input.replaceAll("\\s","");

        for (int i = 0; i < scoreWithNoSpace.length(); i++ ) {

            if (scoreWithNoSpace.charAt(i) != '-') {
                value = scoreWithNoSpace.charAt(i);
                totalScore = totalScore + Character.getNumericValue(value);
            }
        }

        return totalScore;
    }

}

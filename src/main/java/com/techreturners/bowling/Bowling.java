package com.techreturners.bowling;

public class Bowling {

    public int calculateScore(String input){

        int totalScore = 0;
        int value = 0;
        int prevValue = 0;
        int nextValue = 0;

        String scoreWithNoSpace = input.replaceAll("\\s","");

        for (int i = 0; i < scoreWithNoSpace.length(); i++ ) {

            value = scoreWithNoSpace.charAt(i);

            if (scoreWithNoSpace.charAt(i) == '/') {

                prevValue = scoreWithNoSpace.charAt(i - 1);
                nextValue = scoreWithNoSpace.charAt(i + 1);

                if( i == (scoreWithNoSpace.length()-2) ) {
                    totalScore += 10 - Character.getNumericValue(prevValue);
                }
                else {
                    totalScore += Character.getNumericValue(nextValue) + 10 - Character.getNumericValue(prevValue);
                }
            }
            else if (scoreWithNoSpace.charAt(i) != '-') {
                totalScore = totalScore + Character.getNumericValue(value);
            }
        }

        return totalScore;
    }

}

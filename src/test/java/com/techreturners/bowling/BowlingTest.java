package com.techreturners.bowling;

import org.junit.Test;
import org.junit.Assert;

public class BowlingTest {

    private String inputStr = "";
    private int actualScore = 0;
    private int expectedScore = 0;

    @Test
    public void checkForAllRollsWithOneValue(){
        //Arrange
        Bowling bowlingGame = new Bowling();
        inputStr = "43";

        //Act
        actualScore = bowlingGame.calculateScore(inputStr);
        expectedScore = 7;

        //Assert
        Assert.assertEquals(expectedScore, actualScore);
    }

    @Test
    public void checkForAllRollsWithValidValues(){
        //Arrange
        Bowling bowlingGame = new Bowling();
        inputStr = "22 33 44 36 22 11 33 54 27 90";

        //Act
        actualScore = bowlingGame.calculateScore(inputStr);
        expectedScore = 64;

        //Assert
        Assert.assertEquals(expectedScore, actualScore);
    }
}

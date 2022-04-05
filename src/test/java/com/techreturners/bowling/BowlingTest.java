package com.techreturners.bowling;

import org.junit.Test;
import org.junit.Assert;

public class BowlingTest {

    private String inputStr = "";
    private int actualScore = 0;
    private int expectedScore = 0;

    @Test
    public void checkForOneRoll(){
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
    public void checkForTwoRolls(){
        //Arrange
        Bowling bowlingGame = new Bowling();
        inputStr = "22 33";

        //Act
        actualScore = bowlingGame.calculateScore(inputStr);
        expectedScore = 10;

        //Assert
        Assert.assertEquals(expectedScore, actualScore);
    }

    @Test
    public void checkForAllRollsWithValidValues(){
        //Arrange
        Bowling bowlingGame = new Bowling();
        inputStr = "23 33 44 36 22 11 33 54 27 90";

        //Act
        actualScore = bowlingGame.calculateScore(inputStr);
        expectedScore = 67;

        //Assert
        Assert.assertEquals(expectedScore, actualScore);
    }

    @Test
    public void checkForOneRollsWithBothMissed(){
        //Arrange
        Bowling bowlingGame = new Bowling();
        inputStr = "--";

        //Act
        actualScore = bowlingGame.calculateScore(inputStr);
        expectedScore = 0;

        //Assert
        Assert.assertEquals(expectedScore, actualScore);
    }

    @Test
    public void checkForOneRollsWithOneMiss(){
        //Arrange
        Bowling bowlingGame = new Bowling();
        inputStr = "7-";

        //Act
        actualScore = bowlingGame.calculateScore(inputStr);
        expectedScore = 7;

        //Assert
        Assert.assertEquals(expectedScore, actualScore);
    }

    @Test
    public void checkForThreeRollsWithOneMiss(){
        //Arrange
        Bowling bowlingGame = new Bowling();
        inputStr = "7- 8- 9-";

        //Act
        actualScore = bowlingGame.calculateScore(inputStr);
        expectedScore = 24;

        //Assert
        Assert.assertEquals(expectedScore, actualScore);
    }

    @Test
    public void checkForAllRollsWithOneMiss(){
        //Arrange
        Bowling bowlingGame = new Bowling();
        inputStr = "9- 9- 9- 9- 9- 9- 9- 9- 9- 9-";

        //Act
        actualScore = bowlingGame.calculateScore(inputStr);
        expectedScore = 90;

        //Assert
        Assert.assertEquals(expectedScore, actualScore);
    }


}

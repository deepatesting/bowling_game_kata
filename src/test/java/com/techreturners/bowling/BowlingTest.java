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

    @Test
    public void checkForOneRollWithOneSpare(){
        //Arrange
        Bowling bowlingGame = new Bowling();
        inputStr = "5/ 5";

        //Act
        actualScore = bowlingGame.calculateScore(inputStr);
        expectedScore = 15;

        //Assert
        Assert.assertEquals(expectedScore, actualScore);
    }

    @Test
    public void checkForTwoRollsWithOneSpare(){
        //Arrange
        Bowling bowlingGame = new Bowling();
        inputStr = "5/ 53";

        //Act
        actualScore = bowlingGame.calculateScore(inputStr);
        expectedScore = 23;

        //Assert
        Assert.assertEquals(expectedScore, actualScore);
    }

    @Test
    public void checkForAllRollsWithOneSpare(){
        //Arrange
        Bowling bowlingGame = new Bowling();
        inputStr = "5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/5";

        //Act
        actualScore = bowlingGame.calculateScore(inputStr);
        expectedScore = 150;

        //Assert
        Assert.assertEquals(expectedScore, actualScore);
    }

    @Test
    public void checkForOneRollWithOneStrike(){
        //Arrange
        Bowling bowlingGame = new Bowling();
        inputStr = "X 53";

        //Act
        actualScore = bowlingGame.calculateScore(inputStr);
        expectedScore = 18;

        //Assert
        Assert.assertEquals(expectedScore, actualScore);
    }

    @Test
    public void checkForTwoRollWithOneStrike(){
        //Arrange
        Bowling bowlingGame = new Bowling();
        inputStr = "X 36 53";

        //Act
        actualScore = bowlingGame.calculateScore(inputStr);
        expectedScore = 36;

        //Assert
        Assert.assertEquals(expectedScore, actualScore);
    }

    /*

    @Test
    public void checkForAllRollsWithAllStrike(){
        //Arrange
        Bowling bowlingGame = new Bowling();
        inputStr = "X X X X X X X X X X X X";

        //Act
        actualScore = bowlingGame.calculateScore(inputStr);
        expectedScore = 300;

        //Assert
        Assert.assertEquals(expectedScore, actualScore);
    }

     */
}

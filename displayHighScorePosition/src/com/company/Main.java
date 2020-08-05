// This is quite an important challenge. One i found quite difficult
//   and should look over from time to time

package com.company;

public class Main {
    public static void main(String[] args) {
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);
        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bob", highScorePosition);
        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Jimmy", highScorePosition);
        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Mickey", highScorePosition);


    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {

        System.out.println(playerName + " managed to get into position "
                + highScorePosition + " on the high score table ");
    } public static int calculateHighScorePosition(int playerScore) {
        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position;
    }

    /*public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000){
            return 1 ;
        } else if (playerScore >= 500){
            return 2;
        } else if (playerScore >=100 ) {
            return 3 ;
        }  else {
            return  4;
        }*/









}






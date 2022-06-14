package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean gameover=true;
        int score=800;
        int levelcompleted=5;
        int bonus=100;
        int gg= calculateScore(gameover, score, levelcompleted, bonus);
        System.out.println(gg);
        score=10000;
        levelcompleted=8;
        bonus=200;
        gg=calculateScore(gameover, score, levelcompleted, bonus);
        System.out.println(gg);

        int score1=1500, score2=900, score3=400, score4=50;

        int hs1=highscoreposition(score1);
        displyhighcoreposition("Johnny", hs1);
        int hs2=highscoreposition(score2);
        displyhighcoreposition("joey", hs2);
        int hs3=highscoreposition(score3);
        displyhighcoreposition("mikey", hs3);
        int hs4=highscoreposition(score4);
        displyhighcoreposition("stewey", hs4);
    }
    public static int calculateScore(boolean gameover, int score, int levelcompleted, int bonus){
        if(gameover){
            int finalscore=score+(levelcompleted*bonus);
            finalscore+= 1000;
            System.out.println("your final score was:"+ finalscore);
            return finalscore;
        }
        else
        {
            return  -1;
        }




    }

    public static void displyhighcoreposition(String pname, int position){
        System.out.println("the palyer "+pname+" managed to get to position "+position+" on the highscore table");

    }
    public static int highscoreposition(int score){
        if (score>=1000)
        {
            return 1;
        }
        else if (score>=500)
        {
            return 2;
        }
        else if (score>=100){
            return 3;
        }
        return 4;
    }
}

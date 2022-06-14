package com.company;

public class Main {

    private static final String INVALID_VALUE_MESSAGE= "INVALID VALUE!!!";
    public static void main(String[] args) {
        // write your code here
        getDurationString(65, 45);
        getDurationString(3945L );
        getDurationString(-56 );
        getDurationString(65,9 );


    }

    public static void getDurationString(long minutes, long seconds) {
        if (minutes < 0 || (seconds < 0 || seconds > 59)) {
            System.out.println(INVALID_VALUE_MESSAGE);
        } else {
            long hours = minutes / 60;
            minutes = minutes % 60;
           String hourstring= hours+"h ";
           if(hours<10){
               hourstring="0"+hourstring;
           }

           String MinutesString= minutes+"m ";
           if(minutes<10){
               MinutesString="0"+MinutesString;
           }

           String SecondString= seconds+"s ";
           if(seconds<10){
               SecondString="0"+SecondString;
           }
            System.out.println(hourstring+MinutesString+SecondString);

    }}

    public static void getDurationString(long seconds){
        if(seconds<0){
            System.out.println( INVALID_VALUE_MESSAGE);
        }
        else
        {
            long minutes=seconds/60;
            seconds=seconds%60;
            getDurationString(minutes, seconds);
        }
    }
}

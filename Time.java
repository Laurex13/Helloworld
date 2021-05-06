package com.codewithrex;

public class Time {

    public static void main (String[]  args) {
        System.out.println(getTimeString(86399L));


    }


    private static String getTimeString(  long minutes , long seconds) {
        if ( (minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return "Invalid value";
        }
        long  hours = minutes/ 60;
        long remainingMinutes = minutes % 60;
        return hours + ": " + remainingMinutes + ": " + seconds;
    }
        private static String getTimeString(long seconds) {
            if (seconds < 0) {
                return "Invalid value";
            }
            long minutes = seconds /60;
            long remainingSeconds = seconds % 60;

            return getTimeString(minutes , remainingSeconds);
        }

}


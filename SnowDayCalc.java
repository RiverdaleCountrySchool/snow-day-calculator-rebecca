package PACKAGE_NAME;

public class SnowDayCalc {
    public static void main(String[] args) {

        // instructions
        System.out.println("welcome to snow day calculator!");
        System.out.println(" please provide the predicted temperature of the target day in fahrenheit");
        System.out.println(" the predicted inches of snowfall");
        System.out.print(" the first letter of the day of the week ");
        System.out.println(" (use capital letters, T for tuesday and R for thursday.) ");
        System.out.print(" the level of student and faculty anticipation of a snow day");
        System.out.print(" represented by a letter from A-D.");
        System.out.println(" A - low, B - low medium, C - high medium, D - high.");
        System.out.println(" input a true or false value to indicate whether or not there has been a snow day yet this year.");
        System.out.println(" finally, input an integer value from 0-3 indicating the busyness of the anticipated snow day.");

       // check for # of args
        if (args.length != 6){
            System.out.println(" please provide exactly 6 arguments.");
            return;
        }

        // initializing vars
        double temp = Double.valueOf(args[0]);
        int inches = Integer.valueOf(args[1]);
        char day = args[2].charAt(0);
        char anticipation = args[3].charAt(0);
        boolean prevsnowday = Boolean.valueOf(args[4]);
        int busyness = Integer.valueOf(args[5]);
        double score = 0;

        // temp conditional
        if (temp <= -100 || temp >= 100) {
            System.out.println("please input a valid temperature.");;
        } else if (temp <= 40 && temp > 32) {
            score += 1;
        } else if (temp <= 32 && temp > 0) {
            score += 2;
        } else if (temp <= 0) {
            score += 3;
        }

        //System.out.println(score);

        // inches of snowfall conditional
        if (inches < 0 || inches > 50) {
            System.out.println("not a valid input for inches of snowfall.");
        } else if (inches >= 0 && inches <= 2) {
            score += 1;
        } else if (inches >= 3 && inches <= 5) {
            score += 2;
        } else if (inches >= 5) {
            score +=3;
        }

        //System.out.println(score);

        // dotw conditional
        if (!(day == 'M' || day == 'T' || day == 'W' || day == 'R' || day == 'F')) {
            System.out.println("not a valid input for day of the week.");
        } else if (day == 'M') {
            score += 1;
        } else if (day == 'R') {
            score += 2;
        } else if (day == 'F') {
            score +=3;
        }

        //System.out.println(score);

        // anticipation conditional
        if (!(anticipation == 'A' || anticipation == 'B' || anticipation == 'C' || anticipation == 'D')) {
            System.out.println("not a valid input for anticipation.");
        } else if (anticipation == 'C') {
            score += 1;
        } else if (anticipation == 'D') {
            score += 2;
        }

        //System.out.println(score);

        // previous snow day conditional
        if (!prevsnowday) {
            score += 1;;
        }

        //System.out.println(score);

        // busyness conditional
        if (busyness < 0 || busyness > 3) {
            System.out.println("not a valid input for busyness.");
        } else if (busyness == 2) {
            score += 1;
        } else if (busyness == 1) {
            score += 2;
        } else if (busyness == 0) {
            score +=3;
        }

        //System.out.println(score);

        // print user's final chance
        // user's total pts over total pts available
        System.out.println("your chance of a snowday is... " + Math.round((score/15) * 100) + "%");

    }
}

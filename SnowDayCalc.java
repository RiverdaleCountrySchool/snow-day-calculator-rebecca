package PACKAGE_NAME;

public class SnowDayCalc {
    public static void main(String[] args) {

        // instructions
        System.out.println("welcome to snow day calculator!");
        System.out.print(" please provide the predicted temperature of the target day in fahrenheit");
        System.out.print(", the predicted inches of snowfall");
        System.out.println(", the day of the week,");
        System.out.print(" the level of student and faculty anticipation of a snow day");
        System.out.print(" represented by a letter from A-D");
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
        char dayoftheweek = args[2].charAt(0);
        char anticipation = args[2].charAt(0);
        boolean prevsnowday = Boolean.valueOf(args[4]);
        int busyness = Integer.valueOf(args[5]);
        int score = 0;

        if (temp <= -100 || temp >= 100) {
            System.out.println("please input a valid temperature.");;
        } else if (temp <= 40) {
            score += 1;
        } else if (temp <= 32) {
            score += 2;
        } else if (temp <= 0) {
            score += 3;
        }

        if (inches < 0 || inches > 50) {
            System.out.println("not a valid input.");
        } else if (inches >= 0 && inches <= 2) {
            score += 1;
        } else if (inches >= 3 && inches <= 5) {
            score += 2;
        } else if (inches >= 5) {
            score +=3;
        }
    }
}

package Greeting;

import java.util.Calendar;

public class Greeting {

    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();
        int hour = cal.get(Calendar.HOUR_OF_DAY);

        String name = "Your Name";

        GreetingMsg greeting = new GreetingMsg();

        if (hour >= 0 && hour <= 12)
            System.out.println(greeting.morning_Greeting(name));

        if (hour > 12 && hour <= 17)
            System.out.println(greeting.afternoon_Greeting(name));

        if (hour > 17 && hour <= 23)
            System.out.println(greeting.evening_Greeting(name));

    }

}

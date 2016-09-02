package Greeting;

class GreetingMsg {

    private String greeting;

    String morning_Greeting(String someone) {

        greeting = "Good moring, " + someone;
        return greeting;

    }

    String afternoon_Greeting(String someone) {

        greeting = "Good Afternoon, " + someone;
        return greeting;

    }

    String evening_Greeting(String someone) {

        greeting = "Good Evening, " + someone;
        return  greeting;

    }
}

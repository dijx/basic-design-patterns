package co.devfoundry;

import com.sun.org.apache.bcel.internal.generic.RETURN;

public class MyDay extends WeekDay {


    protected void work() {
        System.out.println("Obieram ziemniaki");
    }

    protected int goToWork(TypeOfTransport typeOfTransport) {

        switch (typeOfTransport) {

            case CAR:
                return 60;
            case TRAM:
                return 59;
            case BIKE:
                return 58;
            default:
                return 60;
        }
    }

}

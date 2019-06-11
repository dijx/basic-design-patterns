package co.devfoundry;

public class Main {

    public static void main(String[] args) {

        MyDay myDay = new MyDay();

        myDay.everyDayIsExactlyTheSame(TypeOfTransport.TRAM);
        myDay.everyDayIsExactlyTheSame(TypeOfTransport.CAR);
        myDay.everyDayIsExactlyTheSame(TypeOfTransport.BIKE);
    }

}

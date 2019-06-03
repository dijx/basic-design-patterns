package co.devfoundry.observers;

import co.devfoundry.WeatherForecast;

public class InternetNews implements Observer {


    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Inet news: zmiana pogody; temperatura: "+ weatherForecast.getTemperature()+", ciśnienie "+weatherForecast.getPressure());
    }
}

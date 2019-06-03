package co.devfoundry.observers;

import co.devfoundry.WeatherForecast;

public class TvNews implements Observer {

    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("TvNews: zmiana pogody; temperatura: "+ weatherForecast.getTemperature()+", ciśnienie "+weatherForecast.getPressure());
    }
}

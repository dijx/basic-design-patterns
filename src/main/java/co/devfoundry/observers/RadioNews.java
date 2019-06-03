package co.devfoundry.observers;

import co.devfoundry.WeatherForecast;

public class RadioNews implements Observer {

    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Radio News: zmiana pogody; temperatura: "+ weatherForecast.getTemperature()+", ciśnienie "+weatherForecast.getPressure());
    }
}

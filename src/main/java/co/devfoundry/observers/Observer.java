package co.devfoundry.observers;

import co.devfoundry.WeatherForecast;

public interface Observer {

    void updateForecast(WeatherForecast weatherForecast);

}

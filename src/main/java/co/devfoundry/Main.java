package co.devfoundry;

import co.devfoundry.observers.InternetNews;
import co.devfoundry.observers.RadioNews;
import co.devfoundry.observers.TvNews;

public class Main {

    public static void main(String[] args) {

        WeatherForecast weatherForecast = new WeatherForecast();

        InternetNews internetNews = new InternetNews();
        RadioNews radioNews = new RadioNews();
        TvNews tvNews = new TvNews();

        weatherForecast.registerObserver(internetNews);
        weatherForecast.registerObserver(radioNews);
        weatherForecast.registerObserver(tvNews);

        weatherForecast.setPressure(1000);
        weatherForecast.setTemperature(12);
        weatherForecast.notifyObservers();

        for (int i = 15; i < 32; i++) {

            weatherForecast.setTemperature(i);
            weatherForecast.notifyObservers();

        }
        System.out.println("=----------------------=");
        weatherForecast.unregisterObserver(radioNews);
        weatherForecast.unregisterObserver(tvNews);

        weatherForecast.notifyObservers();


    }
}

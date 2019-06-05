package co.devfoundry.carFactories;

public interface CarFactory {

    Car buildBmw(Bmw.Model model);
    Car buildMercedes(Mercedes.Model model);

}

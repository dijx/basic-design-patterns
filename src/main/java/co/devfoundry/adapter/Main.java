package co.devfoundry.adapter;

import co.devfoundry.adapter.api.*;

public class Main {

    public static void main(String[] args) {

//
//        LibraryAPI api = new LibraryAPIImpl();
//        APIAdapter adapter = new APIAdapter();
//
//        User user = new User("Paweł","Cwik","32131212");
//
//        BookConnector connector = new BookConnector(user,api);
//
//        connector.checkAviability("Harry Potter i Zakon Feniksa");
//
//
//        BookConnector connector1 = new BookConnector(user, adapter);
//        connector1.checkAviability("Harry Potter i Zakon Feniksa");

        User user = new User("Paweł","Cwik","32131212");
        LibraryAPIv2 libraryAPIv2 = new LibraryAPIv2Impl();
        APIAdapter apiAdapter = new APIAdapter(libraryAPIv2, user);
        BookConnector connector = new BookConnector(user,apiAdapter);
        connector.checkAviability("Harry Potter i Zakon Feniksa");

    }

}

package co.devfoundry.adapter.api;

import co.devfoundry.adapter.User;

import java.time.LocalDate;

public class APIAdapter implements LibraryAPI {

    LibraryAPIv2 libraryAPIv2;
    User user;

    @Override
    public boolean isAviable(String bookTitle) {
        System.out.println("nie ma książki");
        return false;
    }

    @Override
    public LocalDate dueDate(String bookTitle, String pesel) {
        return null;
    }

    @Override
    public boolean reserve(String bookTitle, String pesel) {
        return false;
    }

    public APIAdapter(LibraryAPIv2 libraryAPIv2, User user) {
        this.libraryAPIv2 = libraryAPIv2;
        this.user = user;
    }
}

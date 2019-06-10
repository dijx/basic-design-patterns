package co.devfoundry.adapter.api;

import co.devfoundry.adapter.User;

import java.time.LocalDate;

public class APIAdapter implements LibraryAPI {

    private LibraryAPIv2 libraryAPIv2;
    private User user;

    @Override
    public boolean isAviable(String bookTitle) {
        System.out.println(libraryAPIv2.numberOfAviableCopies(bookTitle));
        if (libraryAPIv2.numberOfAviableCopies(bookTitle) > 0) {
            return true;
        }
        return false;
    }

    @Override
    public LocalDate dueDate(String bookTitle, String pesel) {

        return libraryAPIv2.dueDate(bookTitle, user.getFirstName(), user.getLastName(), user.getDateOfBirth());
    }

    @Override
    public boolean reserve(String bookTitle, String pesel) {

        return libraryAPIv2.reserve(bookTitle, user.getFirstName(), user.getLastName(), user.getDateOfBirth());
    }


    public APIAdapter(LibraryAPIv2 libraryAPIv2, User user) {
        this.libraryAPIv2 = libraryAPIv2;
        this.user = user;
    }
}

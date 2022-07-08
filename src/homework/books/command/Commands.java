package homework.books.command;

public interface Commands {

    int EXIT = 0;
    int ADD_BOOK = 1;
    int PRINT_ALL_BOKS = 2;
    int PRINT_BOOKS_BY_AUTOR_NAME = 3;
    int PRINT_BOOKS_BY_GENRE = 4;
    int PRINT_BOOKS_BY_PRICE = 5;
    int ADD_AUTHOR = 6;

    int PRINT_ALL_AUTHORS=7;

    static void printCommands() {
        System.out.println("please input " + EXIT + " for exit");
        System.out.println("please input " + ADD_BOOK + " for add book");
        System.out.println("please input " + PRINT_ALL_BOKS + " for Print All Books");
        System.out.println("please input " + PRINT_BOOKS_BY_AUTOR_NAME + " for print Books by AuthorName");
        System.out.println("please input " + PRINT_BOOKS_BY_GENRE + " for print Books by genre");
        System.out.println("please input " + PRINT_BOOKS_BY_PRICE + " for print books by price range");
        System.out.println("please input " + ADD_AUTHOR + " for author data");
        System.out.println("please input " + PRINT_ALL_AUTHORS + " for print all authors");
    }
}

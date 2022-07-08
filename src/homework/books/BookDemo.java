package homework.books;

import homework.books.enam.Gender;
import homework.books.exception.AuthorNotFoundException;
import homework.books.model.Author;
import homework.books.model.Book;
import homework.books.storage.AuthorStorage;
import homework.books.storage.BookStorage;
import homework.books.command.Commands;

import java.util.Scanner;

public class BookDemo implements Commands {

    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();
    private static AuthorStorage authorStorage = new AuthorStorage();

    public static void main(String[] args) {

        loginPassword();

        Gender male = Gender.MALE;
        String maleStr = male.name();
        Gender female = Gender.FEMALE;
        String femaleStr = female.name();
        Author Tolstoy = new Author("Lev", "Tolstoy", "tolstoy@mail.com", maleStr);
        authorStorage.add(Tolstoy);
        Author Dyuma = new Author("Alexander", "Dyuma", "alex@mail.com", maleStr);
        authorStorage.add(Dyuma);
        Author Raffi = new Author("Raffi", "Samvelyan", "raf@mail.com", maleStr);
        authorStorage.add(Raffi);

        bookStorage.add(new Book("Vayna i Mir", Tolstoy, 1450.4, 2, "rus dasakan"));
        bookStorage.add(new Book("Ereq hracanakirner", Dyuma, 500.6, 6, "arkacayin"));
        bookStorage.add(new Book("Xachagoxi Hishatakaran", Raffi, 4000.8, 10, "hay dasakan"));
//        bookStorage.add(new Book("Kaycer", "Rafi", 1540, 12, "hay dasakan"));


        boolean run = true;
        while (run) {
            Commands.printCommands();
            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                command = -1;
            }

            switch (command) {
                case EXIT:
                    run = false;
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case PRINT_ALL_BOKS:
                    bookStorage.print();
                    break;
                case PRINT_BOOKS_BY_AUTOR_NAME:
                    printBooksByAuthorName();
                    break;
                case PRINT_BOOKS_BY_GENRE:
                    printBookByGenre();
                    break;
                case PRINT_BOOKS_BY_PRICE:
                    printBooksByPriceRange();
                    break;
                case ADD_AUTHOR:
                    addAuthorData();
                    break;
                case PRINT_ALL_AUTHORS:
                    authorStorage.print();
                    break;

                default:
                    System.out.println("Invalid Command");
            }
        }
    }

    private static void loginPassword() {
        String login = "ADMIN";
        String password = "123456";
        System.out.print("Please input login: ");
        String loginStr = scanner.nextLine();
        System.out.print("Please input password: ");
        String passwordStr = scanner.nextLine();

        if (loginStr.equals(login) && passwordStr.equals(password)) {
            System.out.println("Access Granted!!!!!");
        } else if (loginStr.equals(login)) {
            System.out.println("Invalid Password!");
            loginPassword();
        } else if (passwordStr.equals(password)) {
            System.out.println("Invalid Login");
            loginPassword();
        } else {
            System.out.println("Invalid Login & Password");
            loginPassword();
        }

    }

    private static void addAuthorData() {

        System.out.println("Please input author name");
        String authorName = scanner.nextLine();
        System.out.println("Please input author surname");
        String authorSurname = scanner.nextLine();
        System.out.println("Please input author email");
        String authorEmail = scanner.nextLine();
        System.out.println("Please input author gender");
        String genderStr = scanner.nextLine();
        Gender gender = Gender.valueOf(genderStr.toUpperCase());
        String gendStr = gender.name();
        Author author = new Author(authorName, authorSurname, authorEmail, gendStr);
        authorStorage.add(author);
        System.out.println("Author created");
    }
    private static void printBooksByPriceRange() {
        System.out.println("please input range price");
        try {
            double priceRange = Double.parseDouble(scanner.nextLine());
            double priceRange1 = Double.parseDouble(scanner.nextLine());
            bookStorage.printBooksByPriceRange(priceRange, priceRange1);
        } catch (NumberFormatException e) {
            System.out.println("please input number");
            printBooksByPriceRange();
        }
    }
    private static void printBookByGenre() {
        System.out.println("please input book genre");
        String bookGenre = scanner.nextLine();
        bookStorage.printBooksByGenre(bookGenre);
    }

    private static void printBooksByAuthorName() {
        System.out.println("please input author name");
        String authorName = scanner.nextLine();
        bookStorage.printBooksByAuthorName(authorName);
    }

    private static void addBook() {

        if (authorStorage.getSize() != 0) {
            authorStorage.print();
            System.out.println("please chose author index");

            Author author = null;
            try {
                int authorindex = Integer.parseInt(scanner.nextLine());
                author = authorStorage.getLessonBayIndex(authorindex);
                System.out.println("Please input book title");
                String title = scanner.nextLine();
                System.out.println("Please input book price");
                String priceStr = scanner.nextLine();
                System.out.println("Please input book count");
                String countStr = scanner.nextLine();
                System.out.println("Please input book genre");
                String genre = scanner.nextLine();
                double price = Double.parseDouble(priceStr);
                int count = Integer.parseInt(countStr);
                if (genre != null) {
                    genre = genre.trim();
                }
                Book book = new Book(title, author, price, count, genre);
                bookStorage.add(book);
                System.out.println("The book was created");
            } catch (AuthorNotFoundException | NumberFormatException e) {
                System.out.println("Please input correct number or index !!! ");
                addBook();
            }
        }
    }
}





package homework.books;

import homework.books.enam.Gender;
import homework.books.exception.AuthorNotFoundException;
import homework.books.model.Author;
import homework.books.model.Book;
import homework.books.model.User;
import homework.books.model.UserType;
import homework.books.storage.AuthorStorage;
import homework.books.storage.BookStorage;
import homework.books.command.Commands;
import homework.books.storage.UserStorage;

import java.util.Scanner;

public class BookDemo implements Commands {

    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();
    private static AuthorStorage authorStorage = new AuthorStorage();
    private static UserStorage userStorage = new UserStorage();

    public static void main(String[] args) {

        initData();

        boolean run = true;
        while (run) {
            Commands.printLoginCommands();
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
                case LOGIN:
                    login();
                    break;
                case REGISTER:
                    register();
                    break;
                default:
                    System.out.println("Invalid Command");
            }
        }

        loginAdmin();
    }

    private static void login() {

        System.out.println("Please input email,password");
        String emailPasswordString = scanner.nextLine();
        String[] emailPassword = emailPasswordString.split(",");
        User user = userStorage.getUserBayEmail(emailPassword[0]);
        if (user == null) {
            System.out.println("User with " + emailPassword[0] + " does not exists!!!");
        } else {
            if (user.getPassword().equals(emailPassword[1])) {
                if (user.getUserType() == UserType.ADMIN) {
                    loginAdmin();
                } else if (user.getUserType() == UserType.USER) {
                    loginUser();
                }
            } else {
                System.out.println("Password is wrong!!!");
            }
        }
    }

    private static void loginAdmin() {
        boolean run = true;
        while (run) {
            Commands.printAdminCommands();
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

    private static void register() {
        System.out.println("Please input name,surname,email,password");
        String userDataStr = scanner.nextLine();
        String[] userData = userDataStr.split(",");
        if (userData.length < 4) {
            System.out.println("Please input correct data!!!");
        } else {
            if (userStorage.getUserBayEmail(userData[2]) == null) {
                User user = new User();
                user.setName(userData[0]);
                user.setSurname(userData[1]);
                user.setEmail(userData[2]);
                user.setPassword(userData[3]);
                user.setUserType(UserType.USER);
                userStorage.add(user);
                System.out.println("User created!!!");
            } else {
                System.out.println("User with " + userData[2] + " already exists");
            }
        }
    }

    private static void loginUser() {
        boolean run = true;
        while (run) {
            Commands.printUserCommands();
            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                command = -1;
            }

            switch (command) {
                case LOGOUT:
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

    private static void initData() {

        User user = new User("admin", "admin", "admin@mail.com", "admin", UserType.ADMIN);
        userStorage.add(user);

        Author Tolstoy = new Author("Lev", "Tolstoy", "tolstoy@mail.com", Gender.MALE);
        authorStorage.add(Tolstoy);
        Author Dyuma = new Author("Alexander", "Dyuma", "alex@mail.com", Gender.MALE);
        authorStorage.add(Dyuma);
        Author Raffi = new Author("Raffi", "Samvelyan", "raf@mail.com", Gender.MALE);
        authorStorage.add(Raffi);

        bookStorage.add(new Book("Vayna i Mir", Tolstoy, 1450.4, 2, "rus dasakan"));
        bookStorage.add(new Book("Ereq hracanakirner", Dyuma, 500.6, 6, "arkacayin"));
        bookStorage.add(new Book("Xachagoxi Hishatakaran", Raffi, 4000.8, 10, "hay dasakan"));
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
        Gender gender = Gender.valueOf(genderStr.toUpperCase().trim());
        Author author = new Author(authorName, authorSurname, authorEmail, gender);
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





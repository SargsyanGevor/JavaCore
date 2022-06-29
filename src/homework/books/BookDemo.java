package homework.books;


import java.util.Scanner;

public class BookDemo {

    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();

    public static void main(String[] args) {

        bookStorage.add(new Book("Vayna i Mir", "Dastaevski", 1450.4, 2, "rus dasakan"));
        bookStorage.add(new Book("Ereq hracanakirner", "Dyuma", 500.6, 6, "arkacayin"));
        bookStorage.add(new Book("Xachagoxi Hishatakaran", "Rafi", 4000.8, 10, "hay dasakan"));
        bookStorage.add(new Book("Kaycer", "Rafi", 1540, 12, "hay dasakan"));


        boolean run = true;
        while (run) {
            System.out.println("please input 0 for exit");
            System.out.println("please input 1 for add book");
            System.out.println("please input 2 for Print All Books");
            System.out.println("please input 3 for print Books by AuthorName");
            System.out.println("please input 4 for print Books by genre");
            System.out.println("please input 5 for print books by price range");

            int command = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case 0:
                    run = false;
                    break;
                case 1:
                    addbook();
                    break;
                case 2:
                    bookStorage.print();
                    break;
                case 3:
                    printBooksByAuthorName();
                    break;
                case 4:
                    printBookByGenre();
                    break;
                case 5:
                    printBooksByPriceRange();
                    break;
                default:
                    System.out.println("Invalid Command");

            }

        }
    }

    private static void printBooksByPriceRange() {
        System.out.println("please input range");
        double priceRange = Double.parseDouble(scanner.nextLine());
        double priceRange1 = Double.parseDouble(scanner.nextLine());
        bookStorage.printBooksByPriceRange(priceRange, priceRange1);


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

    private static void addbook() {
        System.out.println("Please input book title");
        String title = scanner.nextLine();
        System.out.println("Please input book author name");
        String authorName = scanner.nextLine();
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
        if (authorName != null) {
            authorName = authorName.trim();
        }Book book = new Book(title, authorName, price, count, genre);
        bookStorage.add(book);
        System.out.println("The book was created");
    }
}


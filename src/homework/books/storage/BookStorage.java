package homework.books.storage;


import homework.books.model.Book;

public class BookStorage {

    private static Book[] array = new Book[10];
    private static int size = 0;


    public void add(Book books) {
        if (size == array.length) {
            increaseArray();
        }
        array[size++] = books;
    }

    private void increaseArray() {
        Book[] temp = new Book[size + 10];
        for (int i = 0; i < size; i++) {
            temp[i] = array[i];

        }
        array = temp;
    }


    public void print() {
        for (int i = 0; i < size; i++) {

            System.out.println(i + ". " + array[i]);
        }
    }

    public void printBooksByAuthorName(String authorName) {

        for (int i = 0; i < size; i++) {
            if (array[i].getAuthor().equals(authorName)) {
                System.out.println(array[i]);
            }

        }

    }

    public void printBooksByGenre(String bookGenre) {

        for (int i = 0; i < size; i++) {
            if (array[i].getGenre().equalsIgnoreCase(bookGenre)) {
                System.out.println(array[i]);
            }
        }
//        System.err.println("where is not found any book by this genre , try another keyword" );
    }

    public void printBooksByPriceRange(double priceRange, double priceRange1) {

        for (int i = 0; i < size; i++) {
            if (array[i].getPrice() >= priceRange && array[i].getPrice() <= priceRange1) {
                System.out.println(array[i]);
            }
        }
    }

    public int getSize() {
        return size;
    }

    public Book getStudentBayIndex(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        return array[index];
    }
}




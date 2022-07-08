package homework.books.storage;

import homework.books.exception.AuthorNotFoundException;
import homework.books.model.Author;


public class AuthorStorage {

    private static Author[] array = new Author[10];
    private static int size = 0;


    public void add(Author author) {
        if (size == array.length) {
            increaseArray();
        }
        array[size++] = author;
    }

    private void increaseArray() {
        Author[] temp = new Author[size + 10];
        if (size >= 0) System.arraycopy(array, 0, temp, 0, size);
        array = temp;
    }


    public Author print() {
        for (int i = 0; i < size; i++) {

            System.out.println(i + ". " + array[i]);
        }
        return null;
    }


    public int getSize() {
        return size;
    }


    public Author getLessonBayIndex(int index) throws AuthorNotFoundException {
        if (index < 0 || index >= size) {
            throw new AuthorNotFoundException("Author wit " + index + " does not exists");

        }
        return array[index];
    }
}





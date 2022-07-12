package homework.books.storage;


import homework.books.model.User;

public class UserStorage {

    private static User[] array = new User[10];
    private static int size = 0;


    public void add(User user) {
        if (size == array.length) {
            increaseArray();
        }
        array[size++] = user;
    }

    private void increaseArray() {
        User[] temp = new User[size + 10];
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

    public int getSize() {
        return size;
    }

    public User getUserBayIndex(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        return array[index];
    }

    public User getUserBayEmail(String email) {
        for (int i = 0; i < size; i++) {
            if (array[i].getEmail().equals(email)){
                return array[i];
            }
        } return null;
    }
}




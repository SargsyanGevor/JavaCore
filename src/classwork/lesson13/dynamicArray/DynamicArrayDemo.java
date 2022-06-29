package classwork.lesson13.dynamicArray;

public class DynamicArrayDemo {

    public static void main(String[] args) {

        DynamicArray dynArray = new DynamicArray();

        dynArray.add(0);
        dynArray.add(1);
        dynArray.add(2);
        dynArray.add(3);
        dynArray.add(4);
        dynArray.add(5);
        dynArray.add(6);
        dynArray.add(7);
        dynArray.add(8);
        dynArray.add(9);
        dynArray.add(10);
        dynArray.add(11);
        dynArray.add(12);
        dynArray.add(13);

        dynArray.isEmpty();
        dynArray.getByIndex(4);
        dynArray.getFirstIndexByValue(10);
        dynArray.set(5,85);
        dynArray.add(1,125);
        dynArray.delete(8);
        dynArray.printArray();

    }

}

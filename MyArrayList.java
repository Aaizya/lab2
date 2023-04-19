import java.util.Arrays;

public class MyArrayList<T>{
    private Object[] elements;
    private int size;

    public MyArrayList() {
        elements = new Object[10];
        size = 10;
    }

    public void add(T element) {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, 2 * elements.length);
        }

        elements[size] = element;
        size++;
    }
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of bounds: " + index);
        }
        return (T) elements[index];
    }
    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of bounds: " + index);
        }

}

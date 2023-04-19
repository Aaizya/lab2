import java.util.Arrays;

public class MyArrayList<T> {
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
        T removedElement = (T) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
        return removedElement;
    }
public int size() {
    return size;
}
    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elements[i])) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(Object o) {
        for (int i = size - 1; i >= 0; i--) {
            if (o.equals(elements[i])) {
                return i;

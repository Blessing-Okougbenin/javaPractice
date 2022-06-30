package dsa;

import java.util.Objects;

public class ArrayList implements List {
    private int size = 0;
    private int length = 0;
    private String[] elements = new String[5];
    private int arraySize = 5;
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void add(String item) {
        if (size == arraySize-1){
        int previousSize = arraySize;
        arraySize *= 2;
        String [] newElements = new String[arraySize];
        System.arraycopy(elements,0, newElements,0, previousSize);
        elements = newElements;
        }
        elements[size] = item;
        size++;
    }

    @Override
    public void remove(String item) {
        for (int i = 0; i < size; i++) {
            if (Objects.equals(item, elements[i])) {
                System.arraycopy(elements, i + 1, elements, i, size - i);
            }
        }

        size--;

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String get(int index) {
        if (length == elements.length - 1) length = Integer.parseInt(elements[index]);
       return elements[index];
    }

    @Override
    public int capacity() {
        return elements.length;
    }
}

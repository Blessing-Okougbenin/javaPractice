package dsa;

public interface List {
    boolean isEmpty();

    void add(String item);

    void remove(String s);

    int size();

    String get(int index);

    int capacity();
}

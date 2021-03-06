package com.structure.第11章_avl_tree;

public interface Set<E> {

    void add(E e);
    boolean contains(E e);
    void remove(E e);
    int getSize();
    boolean isEmpty();
}

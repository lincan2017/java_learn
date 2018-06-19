package pattern.decorator;

import java.util.*;
import java.util.function.UnaryOperator;

/**
 * @author : Lin Can
 * @description : 定义一个只读的List
 * @modified ：By
 * @date : 2018/5/18 9:36
 */
public class ReadOnlyList<E> implements List<E> {
    private List<E> list;

    public ReadOnlyList(List<E> list) {
        this.list = list;
    }


    @Override
    public boolean add(E e) {
        throw new RuntimeException("该类只读，不能添加");
    }

    @Override
    public boolean remove(Object o) {
        throw new RuntimeException("该类只读，不能删除");
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        throw new RuntimeException("该类只读，不能添加");
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        throw new RuntimeException("该类只读，不能添加");
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new RuntimeException("该类只读，不能删除");
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new RuntimeException("该类只读，不能修改");
    }

    @Override
    public void clear() {
        throw new RuntimeException("该类只读，不能删除");
    }

    @Override
    public E set(int index, E element) {
        throw new RuntimeException("该类只读，不能修改");
    }

    @Override
    public void add(int index, E element) {
        throw new RuntimeException("该类只读，不能修改");
    }

    @Override
    public E remove(int index) {
        throw new RuntimeException("该类只读，不能修改");
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        throw new RuntimeException("该类只读，不能修改");
    }

    @Override
    public void replaceAll(UnaryOperator<E> operator) {
        throw new RuntimeException("该类只读，不能修改");
    }

    @Override
    public void sort(Comparator<? super E> c) {
        this.list.sort(c);
    }

    @Override
    public Spliterator<E> spliterator() {
        return this.list.spliterator();
    }

    @Override
    public int size() {
        return this.list.size();
    }

    @Override
    public boolean isEmpty() {
        return this.list.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return this.list.contains(o);
    }

    @Override
    public Iterator<E> iterator() {
        return this.list.iterator();
    }

    @Override
    public Object[] toArray() {
        return this.list.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return this.list.toArray(a);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return this.list.containsAll(c);
    }

    @Override
    public E get(int index) {
        return this.list.get(index);
    }

    @Override
    public int indexOf(Object o) {
        return this.list.indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
        return this.list.lastIndexOf(o);
    }

    @Override
    public ListIterator<E> listIterator() {
        return this.list.listIterator();
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return this.list.listIterator(index);
    }
}

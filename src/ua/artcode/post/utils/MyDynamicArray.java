package ua.artcode.post.utils;


import java.util.Arrays;

/**
 * Created by serhii on 03.07.16.
 */
public class MyDynamicArray {

    private Object[] array;
    private int size;

    public MyDynamicArray() {
        array = new Object[10];
    }

    public void add(Object el){
        if(size == array.length){
            growArraySize();
        }
        array[size++] = el;
    }

    public Object getItem(int index){
        return array[index];
    }

    public int size(){
        return size;
    }

    public Object[] toArray(){
        return Arrays.copyOf(array, size);
    }

    private void growArraySize() {
        Object[] newArr = new Object[array.length * 2];
        System.arraycopy(array, 0, newArr, 0, array.length);
        this.array = newArr;
    }

}

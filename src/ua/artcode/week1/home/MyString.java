package ua.artcode.week1.home;

/**
 * Created by serhii on 26.06.16.
 */
public class MyString {

    private char[] mas;

    public void init(char[] mas){
        this.mas = mas;
    }

    public void init(String str){
        this.mas = str.toCharArray();
    }

    public MyString concat(MyString other){
        // this + other
        return null;
    }


}

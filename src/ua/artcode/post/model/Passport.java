package ua.artcode.post.model;

/**
 * Created by serhii on 02.07.16.
 */
public class Passport {

    private String number;
    private String fullname;

    public Passport(String number, String fullname) {
        this.number = number;
        this.fullname = fullname;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "number='" + number + '\'' +
                ", fullname='" + fullname + '\'' +
                '}';
    }
}

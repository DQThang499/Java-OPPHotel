package baitap.bt5;

import java.util.Scanner;

public class tinhcong {
    private String firstName;
    private String lastName;
    private String hobby;

    public tinhcong(){

    }
    public tinhcong(String firstName, String lastName, String hobby){
        this.firstName = firstName;
        this.hobby = hobby;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}

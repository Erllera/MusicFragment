package com.geektech.a3mes6lesson;

public class Music {
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Music(String number, String name, String author, String time) {
        this.number = number;
        this.name = name;
        this.author = author;
        this.time = time;
    }

    String  number;
    String name;
    String author;
    String time;

}

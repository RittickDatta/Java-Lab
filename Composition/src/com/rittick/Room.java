package com.rittick;

/**
 * Created by Rittick on 1/30/2017.
 */
public class Room {
    private Bed bed = new Bed("King", 3, true);
    private Desk desk = new Desk("Medium", true, true);
    private Chair chair = new Chair("Study", true);
    private Book book = new Book("Code of the Extraordinary Mind");


    public void handleBook(){
        desk.placeBook(book);
        desk.removeBook(book);
    }

    public Room(){

    }
    public Room(Bed bed, Desk desk, Chair chair, Book book) {
        this.bed = bed;
        this.desk = desk;
        this.chair = chair;
        this.book = book;
    }

    public Bed getBed() {
        return bed;
    }

    public Desk getDesk() {
        return desk;
    }

    public Chair getChair() {
        return chair;
    }

    public Book getBook() {
        return book;
    }
}

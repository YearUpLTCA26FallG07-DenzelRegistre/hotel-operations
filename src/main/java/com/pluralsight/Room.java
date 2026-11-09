package com.pluralsight;

public class Room {
    //could be a string
    private int roomNumber;
    private double price;
    private int numberOfBeds;
    private String roomType;
    private boolean isOccupied;
    private boolean isDirty;
    private boolean isAvailable;

    public Room(int roomNumber, double price, int numberOfBeds, String roomType, boolean isOccupied, boolean isDirty, boolean isAvailable) {
        this.roomNumber = roomNumber;
        this.price = price;
        this.numberOfBeds = numberOfBeds;
        this.roomType = roomType;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
        this.isAvailable = isAvailable;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public void setDirty(boolean dirty) {
        isDirty = dirty;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}

package com.pluralsight;

public class Room {
    //roomNumber could be a string if room have letters
    private int roomNumber;

    private int numberOfBeds;
    private String roomType;
    private boolean isOccupied;
    private boolean isDirty;
    private boolean ckeckedIn;
    private String checkedOutTo;
    private boolean checkOut;
    private boolean available;


    public Room(int roomNumber, double price, int numberOfBeds, String roomType, boolean isOccupied, boolean isDirty, boolean isAvailable) {
        this.roomNumber = roomNumber;
        this.numberOfBeds = numberOfBeds;
        this.roomType = roomType;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;

    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
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

    public boolean isCkeckedIn(String name){
        if (ckeckedIn){
            checkedOutTo = name;
            available = false;
            this.isDirty = true;
            this.isOccupied = true;
        }


    }

    public boolean cleanRoom(){
        boolean housekeeping;
        if(available){
            housekeeping = true;

        } else
            housekeeping = false;

    }
    public boolean isCheckOut(){

    }

}



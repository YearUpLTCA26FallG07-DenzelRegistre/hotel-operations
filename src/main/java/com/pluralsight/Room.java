package com.pluralsight;

public class Room {

    private int roomNumber;

    private int numberOfBeds;
    private String roomType;
    private boolean isOccupied;
    private boolean isDirty;
    private boolean ckeckIn;
    private String checkedOutTo;
    private boolean checkOut;
    private boolean available;
    private String guestName;


    public Room(int roomNumber, double price, int numberOfBeds, String roomType, boolean isOccupied, boolean isDirty, String guestName) {
        this.roomNumber = roomNumber;
        this.numberOfBeds = numberOfBeds;
        this.roomType = roomType;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
        this.guestName = guestName;
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
    public boolean isCkeckIn(String name) {
        if (ckeckIn) {
            checkedOutTo = name;
            available = false;
            this.isDirty = true;
            this.isOccupied = true;
        }
        return false;
    }


    public boolean cleanRoom(){
        if(isOccupied){
            return false;
        }
        if (!isDirty){
            return false;
        }
        isDirty = false;
        return true;

    }
    public boolean isCheckOut(){
        if (!isOccupied) {
            return false;
        }
        guestName = null;
        isOccupied = false;
        return true;
    }


}



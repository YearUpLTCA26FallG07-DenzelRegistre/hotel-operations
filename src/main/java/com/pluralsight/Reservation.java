package com.pluralsight;

public class Reservation {

    private String roomType;
    private int numberOfNights;
    private boolean weekend;





    public double getPrice() {
        double basePrice = 0;
        if (this.roomType.equalsIgnoreCase("king")) {
            basePrice = 139;
        } else if (this.roomType.equalsIgnoreCase("double")) {
            basePrice = 129;
        } else {
            basePrice = 0;
        }
        return basePrice;

        if(weekend){
            basePrice *= 1.1;
        }

    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }
    public double getReservationTotal(){
        return this.getNumberOfNights() * this.getPrice();
    }

}
